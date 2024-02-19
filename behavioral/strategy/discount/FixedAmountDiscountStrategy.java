package strategy.discount;

public class FixedAmountDiscountStrategy implements DiscountStrategy {
    private double discountAmount;

    public FixedAmountDiscountStrategy(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double apply(double totalPrice) {
        return totalPrice - discountAmount;
    }
}
