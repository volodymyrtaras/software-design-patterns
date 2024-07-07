package vtaras.patterns.additional.circuitbreaker;

public class RemoteService {

    private final CircuitBreaker circuitBreaker;

    public RemoteService(CircuitBreaker circuitBreaker) {
        this.circuitBreaker = circuitBreaker;
    }

    public String call() {
        if (!circuitBreaker.allowRequest()) {
            return "Service is unavailable due to high failure rate";
        }

        try {
            boolean success = simulateRemoteCall();

            if (success) {
                circuitBreaker.recordSuccess();

                return "Service call succeeded";
            } else {
                circuitBreaker.recordFailure();

                return "Service call failed";
            }
        } catch (Exception e) {
            circuitBreaker.recordFailure();

            return "Service call failed with exception";
        }
    }

    private boolean simulateRemoteCall() {
        return Math.random() > 0.5;
    }
}
