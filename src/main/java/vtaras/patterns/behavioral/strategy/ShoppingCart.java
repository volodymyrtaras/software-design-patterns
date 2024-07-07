package vtaras.patterns.behavioral.strategy;

import java.util.List;

public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public List<String> checkout(int amount) {
        return paymentStrategy.pay(amount);
    }
}
