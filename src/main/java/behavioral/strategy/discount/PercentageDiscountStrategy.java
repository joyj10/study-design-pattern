package behavioral.strategy.discount;

import behavioral.strategy.discount.DiscountStrategy;

public class PercentageDiscountStrategy implements DiscountStrategy {
    private double percentage;

    public PercentageDiscountStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double apply(double totalPrice) {
        return totalPrice * (1 - percentage / 100);
    }
}
