package vtaras.patterns.behavioral.strategy;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StrategyTest {

    @Test
    void testCreditCardPaymentStrategy() {
        PaymentStrategy creditCardStrategy = new CreditCardPaymentStrategy("1234567890123456", "123", "12/25");

        List<String> eventList = creditCardStrategy.pay(100);

        Assertions.assertEquals(4, eventList.size());
        Assertions.assertEquals("100 paid using Credit Card", eventList.get(0));
        Assertions.assertEquals("Card Number: 1234567890123456", eventList.get(1));
        Assertions.assertEquals("CVV: 123", eventList.get(2));
        Assertions.assertEquals("Expiry Date: 12/25", eventList.get(3));
    }

    @Test
    void testPayPalPaymentStrategy() {
        PaymentStrategy payPalStrategy = new PayPalPaymentStrategy("example@example.com", "password123");

        List<String> eventList = payPalStrategy.pay(200);

        Assertions.assertEquals(3, eventList.size());
        Assertions.assertEquals("200 paid using PayPal", eventList.get(0));
        Assertions.assertEquals("PayPal Email: example@example.com", eventList.get(1));
        Assertions.assertEquals("PayPal Password: password123", eventList.get(2));
    }

    @Test
    void testShoppingCart() {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPaymentStrategy("1234567890123456", "123", "12/25"));

        List<String> eventList1 = cart.checkout(100);

        Assertions.assertEquals(4, eventList1.size());
        Assertions.assertEquals("100 paid using Credit Card", eventList1.get(0));
        Assertions.assertEquals("Card Number: 1234567890123456", eventList1.get(1));
        Assertions.assertEquals("CVV: 123", eventList1.get(2));
        Assertions.assertEquals("Expiry Date: 12/25", eventList1.get(3));

        cart.setPaymentStrategy(new PayPalPaymentStrategy("example@example.com", "password123"));

        List<String> eventList2 = cart.checkout(200);

        Assertions.assertEquals(3, eventList2.size());
        Assertions.assertEquals("200 paid using PayPal", eventList2.get(0));
        Assertions.assertEquals("PayPal Email: example@example.com", eventList2.get(1));
        Assertions.assertEquals("PayPal Password: password123", eventList2.get(2));
    }
}
