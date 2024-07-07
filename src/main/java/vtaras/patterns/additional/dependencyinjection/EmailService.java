package vtaras.patterns.additional.dependencyinjection;

public class EmailService implements MessageService {

    @Override
    public String sendMessage(String message) {
        return "Sending email: " + message;
    }
}
