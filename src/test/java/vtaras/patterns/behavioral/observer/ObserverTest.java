package vtaras.patterns.behavioral.observer;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ObserverTest {

    @Test
    void testObserverPattern() {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver(subject, "Observer1");
        ConcreteObserver observer2 = new ConcreteObserver(subject, "Observer2");

        List<String> eventList = subject.setState(10);

        Assertions.assertEquals(2, eventList.size());
        Assertions.assertEquals("Observer " + observer1.getName() + " received update with state: 10", eventList.get(0));
        Assertions.assertEquals("Observer " + observer2.getName() + " received update with state: 10", eventList.get(1));

        eventList = subject.setState(20);

        Assertions.assertEquals(2, eventList.size());
        Assertions.assertEquals("Observer " + observer1.getName() + " received update with state: 20", eventList.get(0));
        Assertions.assertEquals("Observer " + observer2.getName() + " received update with state: 20", eventList.get(1));

        subject.detach(observer1);

        eventList = subject.setState(30);

        Assertions.assertEquals(1, eventList.size());
        Assertions.assertEquals("Observer " + observer2.getName() + " received update with state: 30", eventList.get(0));
    }
}
