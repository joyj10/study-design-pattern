package behavioral.strategy.discount;

public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double apply(double totalPrice) {
        return totalPrice;
    }
}
