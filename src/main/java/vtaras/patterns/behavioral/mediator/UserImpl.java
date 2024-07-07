package vtaras.patterns.behavioral.mediator;

public class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public String receive(String message) {
        return this.name + ": Received Message = " + message;
    }
}
