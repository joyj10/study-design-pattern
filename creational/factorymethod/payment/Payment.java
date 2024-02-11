package payment;

public interface Payment {
    void connect();  // 결제 모듈 연결
    void pay(double price); //결제 모듈 실제 결제 진행
}
