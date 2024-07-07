package vtaras.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class PayPalPaymentStrategy implements PaymentStrategy {

    private final String email;
    private final String password;

    public PayPalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public List<String> pay(int amount) {
        List<String> eventList = new ArrayList<>();

        eventList.add(amount + " paid using PayPal");
        eventList.add("PayPal Email: " + email);
        eventList.add("PayPal Password: " + password);

        return eventList;
    }
}
