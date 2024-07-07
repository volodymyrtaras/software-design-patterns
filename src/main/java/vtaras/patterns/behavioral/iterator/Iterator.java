package vtaras.patterns.behavioral.iterator;

/**
 * The Iterator pattern is a behavioral design pattern that provides a way to access elements of a collection sequentially without exposing its underlying representation It
 * decouples the traversal logic from the collection itself, allowing for flexible iteration over various data structures
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
