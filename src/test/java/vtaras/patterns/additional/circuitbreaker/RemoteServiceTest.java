package vtaras.patterns.additional.circuitbreaker;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoteServiceTest {

    private CircuitBreaker circuitBreaker;
    private RemoteService remoteService;

    @BeforeEach
    public void setUp() {
        circuitBreaker = new SimpleCircuitBreaker(3, 1000);
        remoteService = new RemoteService(circuitBreaker);
    }

    @Test
    void testServiceCallSuccess() {
        String response = remoteService.call();

        if (response.equals("Service call succeeded")) {
            Assertions.assertEquals("Service call succeeded", response);
        } else {
            Assertions.assertEquals("Service call failed", response);
        }
    }

    @Test
    void testServiceCallFailure() {
        circuitBreaker.recordFailure();
        circuitBreaker.recordFailure();
        circuitBreaker.recordFailure();

        Assertions.assertEquals("Service is unavailable due to high failure rate", remoteService.call());
    }

    @Test
    void testServiceCallRecovery() throws InterruptedException {
        circuitBreaker.recordFailure();
        circuitBreaker.recordFailure();
        circuitBreaker.recordFailure();

        Assertions.assertEquals("Service is unavailable due to high failure rate", remoteService.call());

        TimeUnit.MILLISECONDS.sleep(1500);

        String response = remoteService.call();
        if (response.equals("Service call succeeded")) {
            Assertions.assertEquals("Service call succeeded", response);
        } else {
            Assertions.assertEquals("Service call failed", response);
        }
    }
}
