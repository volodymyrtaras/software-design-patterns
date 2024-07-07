package vtaras.patterns.additional.circuitbreaker;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleCircuitBreakerTest {

    private SimpleCircuitBreaker circuitBreaker;

    @BeforeEach
    public void setUp() {
        circuitBreaker = new SimpleCircuitBreaker(3, 1000);
    }

    @Test
    void testAllowRequestInitially() {
        Assertions.assertTrue(circuitBreaker.allowRequest());
    }

    @Test
    void testRecordFailure() {
        circuitBreaker.recordFailure();
        circuitBreaker.recordFailure();
        circuitBreaker.recordFailure();

        Assertions.assertFalse(circuitBreaker.allowRequest());
    }

    @Test
    void testRecordSuccessResetsFailures() {
        circuitBreaker.recordFailure();
        circuitBreaker.recordFailure();
        circuitBreaker.recordSuccess();

        Assertions.assertTrue(circuitBreaker.allowRequest());
    }

    @Test
    void testCircuitBreakerOpensAfterFailures() {
        circuitBreaker.recordFailure();
        circuitBreaker.recordFailure();
        circuitBreaker.recordFailure();

        Assertions.assertFalse(circuitBreaker.allowRequest());
    }

    @Test
    void testHalfOpenAfterRetryPeriod() throws InterruptedException {
        circuitBreaker.recordFailure();
        circuitBreaker.recordFailure();
        circuitBreaker.recordFailure();

        Assertions.assertFalse(circuitBreaker.allowRequest());

        TimeUnit.MILLISECONDS.sleep(1500);

        Assertions.assertTrue(circuitBreaker.allowRequest());
    }
}
