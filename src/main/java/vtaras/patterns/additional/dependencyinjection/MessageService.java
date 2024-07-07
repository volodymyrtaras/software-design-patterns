package vtaras.patterns.additional.dependencyinjection;

/*
 * Dependency Injection is a software design pattern where dependencies of a class are provided from the outside rather than created internally
 *
 * It promotes loose coupling, flexibility, and testability by allowing dependencies to be easily substituted or mocked during testing or runtime
 */
public interface MessageService {

    String sendMessage(String message);
}
