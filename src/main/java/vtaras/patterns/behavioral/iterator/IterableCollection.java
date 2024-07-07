package vtaras.patterns.behavioral.iterator;

public interface IterableCollection<T> {

    Iterator<T> createIterator();
}
