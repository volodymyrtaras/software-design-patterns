package vtaras.patterns.behavioral.memento;

/*
 * The Memento pattern is a behavioral design pattern that allows capturing and storing the current state of an object without violating encapsulation
 *
 * This saved state can later be restored, enabling undo or rollback operations in applications
 */
public class Memento {

    private final String state;

    public Memento(String stateToSave) {
        state = stateToSave;
    }

    public String getSavedState() {
        return state;
    }
}
