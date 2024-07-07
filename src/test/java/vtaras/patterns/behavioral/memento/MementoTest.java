package vtaras.patterns.behavioral.memento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MementoTest {

    @Test
    void testMementoPattern() {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State1");
        Assertions.assertEquals("State1", originator.getState());

        caretaker.saveMemento(originator.saveToMemento());

        originator.setState("State2");
        Assertions.assertEquals("State2", originator.getState());

        originator.restoreFromMemento(caretaker.retrieveMemento());
        Assertions.assertEquals("State1", originator.getState());
    }

    @Test
    void testMultipleMementos() {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State1");
        Assertions.assertEquals("State1", originator.getState());

        caretaker.saveMemento(originator.saveToMemento());

        originator.setState("State2");
        Assertions.assertEquals("State2", originator.getState());

        caretaker.saveMemento(originator.saveToMemento());

        originator.setState("State3");
        Assertions.assertEquals("State3", originator.getState());

        originator.restoreFromMemento(caretaker.retrieveMemento());
        Assertions.assertEquals("State2", originator.getState());

        originator.restoreFromMemento(caretaker.retrieveMemento());
        Assertions.assertEquals("State1", originator.getState());
    }
}
