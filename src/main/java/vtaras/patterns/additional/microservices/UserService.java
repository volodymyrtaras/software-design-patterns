package vtaras.patterns.additional.microservices;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/*
 * The Microservices architectural pattern decomposes an application into small, independently deployable services that communicate over well-defined APIs
 *
 * Each service focuses on a specific business capability, promoting agility, scalability, and resilience through loose coupling and decentralized control
 */
public class UserService {

    private static final Map<String, String> USER_STORAGE_MAP = new HashMap<>();

    private UserService() {

    }

    static class UserHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("GET".equals(exchange.getRequestMethod())) {
                handleGetRequest(exchange);
            } else if ("POST".equals(exchange.getRequestMethod())) {
                handlePostRequest(exchange);
            }
        }

        private void handleGetRequest(HttpExchange exchange) throws IOException {
            String path = exchange
                .getRequestURI()
                .getPath();

            String[] pathParts = path.split("/");
            String userId = pathParts[pathParts.length - 1];
            String response = USER_STORAGE_MAP.get(userId);

            if (response == null) {
                response = "User not found";
                exchange.sendResponseHeaders(404, response.getBytes().length);
            } else {
                exchange.sendResponseHeaders(200, response.getBytes().length);
            }

            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

        private void handlePostRequest(HttpExchange exchange) throws IOException {
            StringBuilder newUserBuilder = new StringBuilder();

            try (InputStreamReader reader = new InputStreamReader(exchange.getRequestBody())) {
                char[] buffer = new char[256];
                int read;

                while ((read = reader.read(buffer)) != -1) {
                    newUserBuilder.append(new String(buffer, 0, read));
                }
            }

            String userId = String.valueOf(USER_STORAGE_MAP.size() + 1);
            USER_STORAGE_MAP.put(userId, newUserBuilder.toString());

            exchange.sendResponseHeaders(200, userId.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(userId.getBytes());
            os.close();
        }
    }
}
