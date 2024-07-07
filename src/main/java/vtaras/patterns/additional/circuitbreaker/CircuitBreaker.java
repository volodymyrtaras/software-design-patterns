package vtaras.patterns.additional.circuitbreaker;

/*
 * The Circuit Breaker pattern is a design pattern used to detect and handle service failures in a system by temporarily stopping requests to a failing service
 *
 * It prevents cascading failures and allows the service time to recover, enhancing the system's resilience and stability
 */
public interface CircuitBreaker {

    boolean allowRequest();

    void recordSuccess();

    void recordFailure();
}
