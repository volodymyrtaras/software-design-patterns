package vtaras.patterns.additional.circuitbreaker;

import java.util.concurrent.atomic.AtomicInteger;

public class SimpleCircuitBreaker implements CircuitBreaker {

    private enum State {
        CLOSED, OPEN, HALF_OPEN
    }

    private State state = State.CLOSED;
    private final int failureThreshold;
    private final long retryTimePeriod;
    private final AtomicInteger failureCount = new AtomicInteger(0);
    private long lastFailureTime;

    public SimpleCircuitBreaker(int failureThreshold, long retryTimePeriod) {
        this.failureThreshold = failureThreshold;
        this.retryTimePeriod = retryTimePeriod;
    }

    @Override
    public synchronized boolean allowRequest() {
        if (state == State.OPEN) {
            if (System.currentTimeMillis() - lastFailureTime > retryTimePeriod) {
                state = State.HALF_OPEN;

                return true;
            } else {
                return false;
            }
        }

        return true;
    }

    @Override
    public synchronized void recordSuccess() {
        state = State.CLOSED;

        failureCount.set(0);
    }

    @Override
    public synchronized void recordFailure() {
        failureCount.incrementAndGet();
        lastFailureTime = System.currentTimeMillis();

        if (failureCount.get() >= failureThreshold) {
            state = State.OPEN;
        }
    }
}
