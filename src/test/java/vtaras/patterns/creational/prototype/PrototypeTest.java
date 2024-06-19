package vtaras.patterns.creational.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrototypeTest {

    @Test
    void testGetConcretePrototype1() {
        ConcretePrototype1 original = new ConcretePrototype1("OriginalValue1");
        ConcretePrototype1 clone = (ConcretePrototype1) original.clone();

        Assertions.assertNotSame(original, clone);

        Assertions.assertEquals(original.getField1(), clone.getField1());
        Assertions.assertEquals("OriginalValue1", clone.getField1());
    }

    @Test
    void testGetConcretePrototype2() {
        ConcretePrototype2 original = new ConcretePrototype2(123);
        ConcretePrototype2 clone = (ConcretePrototype2) original.clone();

        Assertions.assertNotSame(original, clone);

        Assertions.assertEquals(original.getField2(), clone.getField2());
        Assertions.assertEquals(123, clone.getField2());
    }
}
