package vtaras.patterns.additional.microservices;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URL;
import java.util.Scanner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UserServiceTest {

    private static HttpServer server;
    private static final String BASE_URL = "http://localhost:8001";

    @BeforeAll
    public static void startServer() throws Exception {
        server = HttpServer.create(new InetSocketAddress(8001), 0);
        server.createContext("/users", new UserService.UserHandler());
        server.setExecutor(null);
        server.start();
    }

    @AfterAll
    public static void stopServer() {
        server.stop(0);
    }

    @Test
    void testGetUser() throws IOException {
        String actualUserId = sendPostRequest("/users", "John");

        String actualResponse = sendGetRequest("/users/" + actualUserId);

        Assertions.assertEquals("John", actualResponse);
    }

    @Test
    void testGetUserNotFound() throws IOException {
        String actualResponse = sendGetRequest("/users/77");

        Assertions.assertEquals("User not found", actualResponse);
    }

    @Test
    void testCreateUser() throws IOException {
        String actualUserId = sendPostRequest("/users", "Alice");

        Assertions.assertEquals("2", actualUserId);
    }

    private String sendGetRequest(String path) throws IOException {
        URL url = new URL(BASE_URL + path);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        StringBuilder response = new StringBuilder();
        try (Scanner scanner = new Scanner(connection.getInputStream())) {
            while (scanner.hasNextLine()) {
                response.append(scanner.nextLine());
            }
        } catch (Exception exception) {
            try (Scanner scanner = new Scanner(connection.getErrorStream())) {
                while (scanner.hasNextLine()) {
                    response.append(scanner.nextLine());
                }
            }
        }

        connection.disconnect();

        return response.toString();
    }

    @SuppressWarnings(value = "SameParameterValue")
    private String sendPostRequest(String path, String requestBody) throws IOException {
        URL url = new URL(BASE_URL + path);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);

        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = requestBody.getBytes();

            os.write(input, 0, input.length);
        }

        StringBuilder response = new StringBuilder();
        try (Scanner scanner = new Scanner(connection.getInputStream())) {
            while (scanner.hasNextLine()) {
                response.append(scanner.nextLine());
            }
        } catch (Exception exception) {
            try (Scanner scanner = new Scanner(connection.getErrorStream())) {
                while (scanner.hasNextLine()) {
                    response.append(scanner.nextLine());
                }
            }
        }

        connection.disconnect();

        return response.toString();
    }
}
