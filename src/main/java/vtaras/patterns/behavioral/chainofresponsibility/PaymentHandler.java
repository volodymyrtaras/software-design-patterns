package vtaras.patterns.behavioral.chainofresponsibility;

/*
 * The Chain of Responsibility pattern is a behavioral design pattern where a request is passed through a chain of handlers, each handling the request or passing it to the next handler in the chain
 *
 * This pattern decouples senders and receivers of requests, allowing multiple objects to handle the request without specifying the exact handler explicitly
 */
public interface PaymentHandler {

    void setNextHandler(PaymentHandler paymentHandler);

    String handlePayment(double amount);
}
