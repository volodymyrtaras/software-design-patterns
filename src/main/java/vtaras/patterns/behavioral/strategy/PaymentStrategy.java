package vtaras.patterns.behavioral.strategy;

import java.util.List;

/*
 * The Strategy pattern is a behavioral design pattern that enables selecting an algorithm at runtime from a family of algorithms
 *
 * It promotes flexibility by encapsulating each algorithm in its own class, allowing objects to vary behavior independently of clients that use them
 */
public interface PaymentStrategy {

    List<String> pay(int amount);
}
