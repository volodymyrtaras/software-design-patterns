package vtaras.patterns.additional.servicelocator;

public class SMSService implements MessagingService {

    @Override
    public String sendMessage(String message) {
        return "Sending SMS: " + message;
    }
}
