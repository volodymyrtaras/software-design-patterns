package vtaras.patterns.creational.factorymethod.logistics;

import vtaras.patterns.creational.factorymethod.transport.Transport;

public abstract class Logistics {

    /*
     * The Factory Method pattern defines an interface for creating objects, allowing subclasses to alter the type of objects that will be created.
     *
     * It delegates the instantiation process to subclasses, promoting loose coupling and enhancing code flexibility.
     *
     * This pattern is useful for scenarios where a class cannot anticipate the class of objects it needs to create.
     */
    public abstract Transport createTransport();
}
