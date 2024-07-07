package vtaras.patterns.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {

    private final Deque<Memento> mementoDeque;

    public Caretaker() {
        mementoDeque = new ArrayDeque<>();
    }

    public void saveMemento(Memento memento) {
        this.mementoDeque.push(memento);
    }

    public Memento retrieveMemento() {
        return mementoDeque.pop();
    }
}
