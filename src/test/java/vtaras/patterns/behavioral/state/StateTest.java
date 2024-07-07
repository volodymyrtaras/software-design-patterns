package vtaras.patterns.behavioral.state;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StateTest {

    @Test
    void testStatePattern() {
        Context context = new ContextImpl();

        context.setState(new ConcreteStateA());
        String resultA = context.request();

        Assertions.assertEquals("Handling request in State A", resultA);

        context.setState(new ConcreteStateB());
        String resultB = context.request();

        Assertions.assertEquals("Handling request in State B", resultB);
    }
}
