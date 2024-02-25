package creational.factorymethod.processor;


import creational.factorymethod.payment.KakaoPay;
import creational.factorymethod.payment.Payment;

public class KakaoPayPaymentProcessor extends PaymentProcessor {
    @Override
    public Payment createPayment() {
        return new KakaoPay();
    }
}
