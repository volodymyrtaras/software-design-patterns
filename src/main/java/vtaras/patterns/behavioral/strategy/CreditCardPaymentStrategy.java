package vtaras.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private final String cardNumber;
    private final String cvv;
    private final String expiryDate;

    public CreditCardPaymentStrategy(String cardNumber, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public List<String> pay(int amount) {
        List<String> eventList = new ArrayList<>();

        eventList.add(amount + " paid using Credit Card");
        eventList.add("Card Number: " + cardNumber);
        eventList.add("CVV: " + cvv);
        eventList.add("Expiry Date: " + expiryDate);

        return eventList;
    }
}
