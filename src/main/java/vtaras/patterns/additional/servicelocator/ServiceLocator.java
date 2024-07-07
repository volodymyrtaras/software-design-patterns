package vtaras.patterns.additional.servicelocator;

import java.util.HashMap;
import java.util.Map;

/*
 * The Service Locator pattern centralizes the location and instantiation of services based on their names or other identifiers, enhancing modularity and flexibility in applications
 *
 * It allows components to obtain services without directly referencing their concrete implementations, promoting loose coupling and easier maintenance
 */
public class ServiceLocator {

    private static final Map<String, MessagingService> SERVICES_MAP = new HashMap<>();

    static {
        SERVICES_MAP.put("emailService", new EmailService());
        SERVICES_MAP.put("smsService", new SMSService());
    }

    public MessagingService getService(String serviceName) {
        return SERVICES_MAP.get(serviceName);
    }

    public String sendNotification(String serviceName, String message) {
        MessagingService service = getService(serviceName);

        if (service != null) {
            return service.sendMessage(message);
        } else {
            throw new IllegalArgumentException("Service not found: " + serviceName);
        }
    }
}
