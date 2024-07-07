package vtaras.patterns.structural.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    void testSimpleCoffee() {
        Coffee coffee = new SimpleCoffee();

        Assertions.assertEquals("Simple coffee", coffee.getDescription());
        Assertions.assertEquals(2.0, coffee.getCost());
    }

    @Test
    void testSimpleCoffeeWithMilk() {
        Coffee coffee = new SimpleCoffee();

        coffee = new MilkDecorator(coffee);

        Assertions.assertEquals("Simple coffee, Milk", coffee.getDescription());
        Assertions.assertEquals(2.5, coffee.getCost());
    }

    @Test
    void testSimpleCoffeeWithSugar() {
        Coffee coffee = new SimpleCoffee();

        coffee = new SugarDecorator(coffee);

        Assertions.assertEquals("Simple coffee, Sugar", coffee.getDescription());
        Assertions.assertEquals(2.2, coffee.getCost());
    }

    @Test
    void testSimpleCoffeeWithMilkAndSugar() {
        Coffee coffee = new SimpleCoffee();

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        Assertions.assertEquals("Simple coffee, Milk, Sugar", coffee.getDescription());
        Assertions.assertEquals(2.7, coffee.getCost());
    }
}
