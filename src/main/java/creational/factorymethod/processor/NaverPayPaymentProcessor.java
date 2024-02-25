package creational.factorymethod.processor;


import creational.factorymethod.payment.NaverPay;
import creational.factorymethod.payment.Payment;

public class NaverPayPaymentProcessor extends PaymentProcessor {
    @Override
    public Payment createPayment() {
        return new NaverPay();
    }
}
