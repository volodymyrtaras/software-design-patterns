package vtaras.patterns.behavioral.observer;

public class ConcreteObserver implements Observer {

    private final ConcreteSubject subject;
    private final String name;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;

        this.subject.attach(this);
    }

    public String getName() {
        return name;
    }

    public String update() {
        return "Observer " + name + " received update with state: " + subject.getState();
    }
}
