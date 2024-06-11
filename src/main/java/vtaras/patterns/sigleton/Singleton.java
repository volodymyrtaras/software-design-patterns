package vtaras.patterns.sigleton;

/*
 * The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.
 *
 * It restricts the instantiation of the class to a single object by making the constructor private
 * and offering a static method to retrieve the instance.
 *
 * This pattern is useful for managing shared resources or configurations.
 */
public class Singleton {

    private Singleton() {

    }

    public static Singleton getInstance() {
        return SingletonInstanceKeeper.INSTANCE;
    }

    @SuppressWarnings(value = "InstantiationOfUtilityClass")
    private static class SingletonInstanceKeeper {

        private static final Singleton INSTANCE = new Singleton();
    }
}
