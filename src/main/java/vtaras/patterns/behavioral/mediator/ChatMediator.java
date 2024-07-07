package vtaras.patterns.behavioral.mediator;

import java.util.List;

/*
 * The Mediator pattern is a behavioral design pattern that promotes loose coupling by centralizing communication between objects through a mediator object
 *
 * It allows objects to interact without explicitly referring to each other, enhancing maintainability and flexibility in complex systems
 */
public interface ChatMediator {

    List<String> sendMessage(String message, User user);

    void addUser(User user);
}
