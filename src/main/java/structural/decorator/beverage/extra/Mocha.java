package structural.decorator.beverage.extra;

import structural.decorator.beverage.Beverage;
import structural.decorator.beverage.extra.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + getExtraPrice();
    }

    private double getExtraPrice() {
        return switch (getSize()) {
            case Beverage.Size.TALL -> 600;
            case Beverage.Size.GRANDE -> 700;
            case Beverage.Size.VENTI -> 800;
            default -> 0;
        };
    }
}
