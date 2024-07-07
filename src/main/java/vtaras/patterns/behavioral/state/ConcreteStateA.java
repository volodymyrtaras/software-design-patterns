package vtaras.patterns.behavioral.state;

public class ConcreteStateA implements State {

    @Override
    public String handleRequest() {
        return "Handling request in State A";
    }
}
