package vtaras.patterns.behavioral.interpreter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InterpreterTest {

    @Test
    void testNumber() {
        Expression number = new Number(5);

        Assertions.assertEquals(5, number.interpret());
    }

    @Test
    void testAddition() {
        Expression five = new Number(5);
        Expression three = new Number(3);
        Expression addition = new Add(five, three);

        Assertions.assertEquals(8, addition.interpret());
    }

    @Test
    void testSubtraction() {
        Expression five = new Number(5);
        Expression three = new Number(3);
        Expression subtraction = new Subtract(five, three);

        Assertions.assertEquals(2, subtraction.interpret());
    }

    @Test
    void testComplexExpression() {
        Expression five = new Number(5);
        Expression three = new Number(3);
        Expression two = new Number(2);
        Expression one = new Number(1);

        Expression addition1 = new Add(five, three);
        Expression addition2 = new Add(two, one);
        Expression result = new Subtract(addition1, addition2);

        Assertions.assertEquals(5, result.interpret());
    }
}
