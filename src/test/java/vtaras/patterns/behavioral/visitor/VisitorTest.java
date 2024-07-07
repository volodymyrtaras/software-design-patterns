package vtaras.patterns.behavioral.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VisitorTest {

    @Test
    void testVisitorWithConcreteElementA() {
        Element element = new ConcreteElementA();
        Visitor visitor = new ConcreteVisitor();

        Assertions.assertEquals("Visitor is processing ConcreteElementA operation", element.accept(visitor));
    }

    @Test
    void testVisitorWithConcreteElementB() {
        Element element = new ConcreteElementB();
        Visitor visitor = new ConcreteVisitor();

        Assertions.assertEquals("Visitor is processing ConcreteElementB operation", element.accept(visitor));
    }
}
