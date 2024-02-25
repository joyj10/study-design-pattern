package creational.factorymethod.payment;

public class NaverPay implements Payment {
    @Override
    public void connect() {
        System.out.println("payment.NaverPay.connect");
    }

    @Override
    public void pay(double price) {
        System.out.println("payment.NaverPay.pay price : " + price);
    }
}
