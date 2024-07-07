package vtaras.patterns.behavioral.command;

/*
 * The Command pattern is a behavioral design pattern that encapsulates a request as an object, allowing for parameterization of clients with queues, requests, and operations
 *
 * It decouples the sender of a request from its receiver by giving the sender a command object that implements a standardized execute method, enabling flexible and extensible request handling
 */
public interface Command {

    String execute();
}
