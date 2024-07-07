package vtaras.patterns.behavioral.state;

public class ConcreteStateB implements State {

    @Override
    public String handleRequest() {
        return "Handling request in State B";
    }
}
