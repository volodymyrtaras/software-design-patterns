package vtaras.patterns.structural.composite;

/*
 * The Composite pattern is a structural design pattern that allows to compose objects into tree structures to represent part-whole hierarchies
 *
 * It enables clients to treat individual objects and compositions of objects uniformly by providing a common interface
 *
 * This pattern is particularly useful for representing hierarchies of objects where complex structures can be treated as a single entity
 */
public interface Graphic {

    String describeAction();
}
