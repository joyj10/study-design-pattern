package payment;

public class NaverPay implements Payment {
    @Override
    public void connect() {
        System.out.println("payment.NaverPay.connect");
    }

    @Override
    public void pay(int price) {
        System.out.println("payment.NaverPay.pay price : " + price);
    }

    @Override
    public void cancel(int price) {
        System.out.println("payment.NaverPay.cancel price : " + price);
    }
}
