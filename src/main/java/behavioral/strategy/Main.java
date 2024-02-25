package behavioral.strategy;

import behavioral.strategy.discount.FixedAmountDiscountStrategy;
import behavioral.strategy.discount.NoDiscountStrategy;
import behavioral.strategy.discount.PercentageDiscountStrategy;

public class Main {
    public static void main(String[] args) {
        // 할인 없는 주문
        Order noDiscountOrder = new Order(10000, new NoDiscountStrategy());
        System.out.println("# noDiscountOrder total price : " + noDiscountOrder.calculatePrice());

        // 할인 없는 주문
        Order fixAmountDiscountOrder = new Order(10000, new FixedAmountDiscountStrategy(1500));
        System.out.println("# fixAmountDiscountOrder total price : " + fixAmountDiscountOrder.calculatePrice());

        // 할인 없는 주문
        Order percentageDiscountOrder = new Order(10000, new PercentageDiscountStrategy(20));
        System.out.println("# percentageDiscountOrder total price : " + percentageDiscountOrder.calculatePrice());
    }
}
