package vtaras.patterns.behavioral.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IteratorTest {

    @Test
    void testIteratorHasNextAndNext() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        ConcreteCollection<Integer> numberCollection = new ConcreteCollection<>(numbers);
        Iterator<Integer> iterator = numberCollection.createIterator();

        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(1, iterator.next());

        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(2, iterator.next());

        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(3, iterator.next());

        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(4, iterator.next());

        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(5, iterator.next());

        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    void testEmptyCollection() {
        Integer[] numbers = {};
        ConcreteCollection<Integer> numberCollection = new ConcreteCollection<>(numbers);
        Iterator<Integer> iterator = numberCollection.createIterator();

        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    void testSingleElementCollection() {
        Integer[] numbers = {42};
        ConcreteCollection<Integer> numberCollection = new ConcreteCollection<>(numbers);
        Iterator<Integer> iterator = numberCollection.createIterator();

        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(42, iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }
}
