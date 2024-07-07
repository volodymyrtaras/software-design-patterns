package vtaras.patterns.additional.servicelocator;

public class EmailService implements MessagingService {

    @Override
    public String sendMessage(String message) {
        return "Sending email: " + message;
    }
}
