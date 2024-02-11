package processor;

import payment.NaverPay;
import payment.Payment;

public class NaverPayPaymentProcessor extends PaymentProcessor {
    @Override
    public Payment createPayment() {
        return new NaverPay();
    }
}
