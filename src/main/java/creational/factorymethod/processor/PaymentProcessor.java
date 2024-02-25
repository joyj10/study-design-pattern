package creational.factorymethod.processor;


import creational.factorymethod.payment.Payment;

public abstract class PaymentProcessor {
    // 팩토리 메서드
    public abstract Payment createPayment();

    public void processPayment(double price) {
        Payment payment = createPayment();
        payment.connect();
        payment.pay(price);
    }
}
