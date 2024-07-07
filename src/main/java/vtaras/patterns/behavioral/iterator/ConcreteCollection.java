package vtaras.patterns.behavioral.iterator;

public class ConcreteCollection<T> implements IterableCollection<T> {

    private final T[] items;

    public ConcreteCollection(T[] items) {
        this.items = items;
    }

    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}
