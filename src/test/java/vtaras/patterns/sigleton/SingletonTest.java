package vtaras.patterns.sigleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void testSingletonInstanceNotNull() {
        Singleton instance = Singleton.getInstance();

        Assertions.assertNotNull(instance, "Singleton instance should not be null");
    }

    @Test
    void testSingletonInstanceUnique() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        Assertions.assertSame(instance1, instance2, "Both instances should be the same");
    }
}
