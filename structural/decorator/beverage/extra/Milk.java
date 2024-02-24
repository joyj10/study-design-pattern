package decorator.beverage.extra;

import decorator.beverage.Beverage;
import decorator.beverage.extra.CondimentDecorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + getExtraPrice();
    }

    private double getExtraPrice() {
        return switch (getSize()) {
            case TALL -> 500;
            case GRANDE -> 600;
            case VENTI -> 700;
            default -> 0;
        };
    }
}
