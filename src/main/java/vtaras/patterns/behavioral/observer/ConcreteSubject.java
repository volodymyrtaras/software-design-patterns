package vtaras.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public List<String> setState(int state) {
        this.state = state;

        return notifyObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public List<String> notifyObservers() {
        List<String> eventList = new ArrayList<>();

        for (Observer observer : observers) {
            eventList.add(observer.update());
        }

        return eventList;
    }
}
