package vtaras.patterns.behavioral.chainofresponsibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChainOfResponsibilityTest {

    @Test
    void testHandlersChain() {
        PaymentHandler bankHandler = new BankPaymentHandler();
        PaymentHandler paypalHandler = new PayPalPaymentHandler();

        bankHandler.setNextHandler(paypalHandler);

        Assertions.assertEquals("Bank handles payment of $500.0", bankHandler.handlePayment(500));
        Assertions.assertEquals("PayPal handles payment of $1500.0", bankHandler.handlePayment(1500));
        Assertions.assertEquals("Bank handles payment of $200.0", bankHandler.handlePayment(200));
    }

    @Test
    void testBankHandler() {
        PaymentHandler paymentHandler = new BankPaymentHandler();

        Assertions.assertEquals("Bank handles payment of $300.0", paymentHandler.handlePayment(300));
    }

    @Test
    void testPayPalHandler() {
        PaymentHandler paymentHandler = new PayPalPaymentHandler();

        Assertions.assertEquals("PayPal handles payment of $2000.0", paymentHandler.handlePayment(2000));
    }

    @Test
    void testBankPaymentHandlerNoSuitableHandlerFound() {
        PaymentHandler paymentHandler = new BankPaymentHandler();

        Assertions.assertEquals("No suitable handler found for payment of $2000.0", paymentHandler.handlePayment(2000));
    }

    @Test
    void testPayPalPaymentHandlerNoSuitableHandlerFound() {
        PaymentHandler paymentHandler = new PayPalPaymentHandler();

        Assertions.assertEquals("No suitable handler found for payment of $200.0", paymentHandler.handlePayment(200));
    }
}
