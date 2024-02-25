package structural.decorator.beverage.extra;

import structural.decorator.beverage.Beverage;
import structural.decorator.beverage.extra.CondimentDecorator;

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
            case Beverage.Size.TALL -> 500;
            case Beverage.Size.GRANDE -> 600;
            case Beverage.Size.VENTI -> 700;
            default -> 0;
        };
    }
}
