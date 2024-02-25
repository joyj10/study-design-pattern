package behavioral.observer.subejct;

import behavioral.observer.observer.StockObserver;

public interface StockMarket {
    void addObserver(StockObserver observer);

    void removeObserver(StockObserver observer);

    void notifyObservers();

    void setStockPrice(String stockCode, double price);
}
