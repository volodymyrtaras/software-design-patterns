package vtaras.patterns.creational.prototype;

/*
 * The Prototype design pattern allows cloning of objects to create new instances without specifying their exact classes
 *
 * It is useful for creating objects when direct instantiation (using new) is expensive or complex
 *
 * By implementing a clone method, objects can produce copies of themselves, enabling efficient object creation and resource reuse
 */
public interface Prototype {

    Prototype clone();
}
