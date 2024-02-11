package processor;

import payment.KakaoPay;
import payment.Payment;

public class KakaoPayPaymentProcessor extends PaymentProcessor {
    @Override
    public Payment createPayment() {
        return new KakaoPay();
    }
}
