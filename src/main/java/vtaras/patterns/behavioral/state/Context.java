package vtaras.patterns.behavioral.state;

public interface Context {

    void setState(State state);

    String request();
}
