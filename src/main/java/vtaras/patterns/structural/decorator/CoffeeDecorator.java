package vtaras.patterns.structural.decorator;

/*
 * The Decorator pattern allows behavior to be added to individual objects, dynamically and transparently, without affecting other objects from the same class
 *
 * It achieves this by creating a set of decorator classes that are used to wrap concrete components
 *
 * This pattern provides a flexible alternative to subclassing for extending functionality
 */
public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratedCoffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
