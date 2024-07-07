package vtaras.patterns.behavioral.observer;

/*
 * The Observer pattern is a behavioral design pattern where an object maintains a list of observers that are notified automatically of any state changes, typically through a common interface
 *
 * This pattern promotes loose coupling between objects, allowing for efficient broadcast communication and ensuring that multiple objects can react dynamically to changes in another object's state
 */
public interface Observer {

    String update();
}
