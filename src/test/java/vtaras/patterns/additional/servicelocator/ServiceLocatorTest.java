package vtaras.patterns.additional.servicelocator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServiceLocatorTest {

    private ServiceLocator serviceLocator;

    @BeforeEach
    public void setUp() {
        serviceLocator = new ServiceLocator();
    }

    @Test
    void testSendEmailNotification() {
        Assertions.assertEquals("Sending email: 1", serviceLocator.sendNotification("emailService", "1"));
    }

    @Test
    void testSendSMSNotification() {
        Assertions.assertEquals("Sending SMS: 1", serviceLocator.sendNotification("smsService", "1"));
    }

    @Test
    void testGetInvalidService() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> serviceLocator.sendNotification("invalidService", "1"));
    }

    @Test
    void testSendNotificationWithInvalidService() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> serviceLocator.sendNotification("invalidService", "Test message"));
    }
}
