package vtaras.patterns.behavioral.chainofresponsibility;

public class BankPaymentHandler implements PaymentHandler {

    private PaymentHandler nextHandler;

    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public String handlePayment(double amount) {
        String message;

        if (amount <= 1000) {
            message = "Bank handles payment of $" + amount;
        } else if (nextHandler != null) {
            message = nextHandler.handlePayment(amount);
        } else {
            message = "No suitable handler found for payment of $" + amount;
        }

        return message;
    }
}
