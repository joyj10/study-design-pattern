package observer.subejct;

import observer.observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class StockExchange implements StockMarket {
    private String stockCode;
    private double price;
    private List<StockObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockCode, price);
        }
    }

    @Override
    public void setStockPrice(String stockCode, double price) {
        this.stockCode = stockCode;
        this.price = price;
        notifyObservers(); // 주식 가격 변동 시 옵저버들에게 알림
    }
}
