package creational.factorymethod;


import creational.factorymethod.processor.KakaoPayPaymentProcessor;
import creational.factorymethod.processor.PaymentProcessor;

public class FactoryMethodeMain {
    public static void main(String[] args) {
        PaymentProcessor kakaoPayPaymentProcessor = new KakaoPayPaymentProcessor();
        kakaoPayPaymentProcessor.processPayment(10000);
    }
}
