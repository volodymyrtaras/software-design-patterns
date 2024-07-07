package vtaras.patterns.behavioral.state;

public class ContextImpl implements Context {

    private State currentState;

    public void setState(State state) {
        this.currentState = state;
    }

    public String request() {
        return currentState.handleRequest();
    }
}
