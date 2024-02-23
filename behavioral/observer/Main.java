package observer;

import observer.observer.StockInvestor;
import observer.subejct.StockExchange;
import observer.subejct.StockMarket;

public class Main {
    public static void main(String[] args) {
        // Subject : StockMarket 생성
        StockMarket stockExchange = new StockExchange();

        // 옵저버 생성 및 등록
        stockExchange.addObserver(new StockInvestor("name1"));
        stockExchange.addObserver(new StockInvestor("name2"));

        // 주식 가격 변동 및 옵저버들 알림 발송
        stockExchange.setStockPrice("GOO", 100.0);
    }
}
