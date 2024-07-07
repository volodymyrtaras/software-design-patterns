package vtaras.patterns.behavioral.observer;

import java.util.List;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    List<String> notifyObservers();
}
