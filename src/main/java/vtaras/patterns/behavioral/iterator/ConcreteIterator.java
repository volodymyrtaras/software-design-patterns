package vtaras.patterns.behavioral.iterator;

public class ConcreteIterator<T> implements Iterator<T> {

    private final T[] items;
    private int position = 0;

    public ConcreteIterator(T[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.length;
    }

    public T next() {
        return items[position++];
    }
}
