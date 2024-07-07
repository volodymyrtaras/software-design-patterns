package vtaras.patterns.additional.dependencyinjection;

public class Service {

    private final MessageService service;

    public Service(MessageService service) {
        this.service = service;
    }

    public String sendNotification(String message) {
        return service.sendMessage(message);
    }
}
