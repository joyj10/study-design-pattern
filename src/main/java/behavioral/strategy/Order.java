package behavioral.strategy;

import behavioral.strategy.discount.DiscountStrategy;

public class Order {
    private double totalPrice;
    private DiscountStrategy discountStrategy;

    public Order(double totalPrice, DiscountStrategy discountStrategy) {
        this.totalPrice = totalPrice;
        this.discountStrategy = discountStrategy;
    }

    public double calculatePrice() {
        return discountStrategy.apply(totalPrice);
    }
}
