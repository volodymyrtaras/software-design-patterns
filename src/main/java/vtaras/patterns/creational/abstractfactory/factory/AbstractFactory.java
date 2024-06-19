package vtaras.patterns.creational.abstractfactory.factory;

import vtaras.patterns.creational.abstractfactory.products.Button;
import vtaras.patterns.creational.abstractfactory.products.Checkbox;

/*
 * The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 *
 * It allows for the creation of objects that are related by a common theme, making the system independent of how its objects are created, composed, and represented.
 *
 * This pattern is useful for ensuring consistency among products and supporting the addition of new product families without altering existing code.
 */
public interface AbstractFactory {

    Button createButton();

    Checkbox createCheckbox();
}
