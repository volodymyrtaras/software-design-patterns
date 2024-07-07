package vtaras.patterns.behavioral.state;

/*
 * The State pattern is a behavioral design pattern that allows an object to alter its behavior when its internal state changes
 *
 * It encapsulates state-specific behaviors in separate classes, promoting cleaner and more modular code by eliminating conditional statements related to state transitions
 */
public interface State {

    String handleRequest();
}
