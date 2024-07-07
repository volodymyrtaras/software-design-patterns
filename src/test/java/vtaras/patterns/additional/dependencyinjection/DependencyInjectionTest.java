package vtaras.patterns.additional.dependencyinjection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DependencyInjectionTest {

    private final MessageService emailService = new EmailService();

    @Test
    void testSendNotification() {
        Service service = new Service(emailService);
        String message = "Hello, world!";

        String result = service.sendNotification(message);

        Assertions.assertEquals("Sending email: " + message, result);
    }
}
