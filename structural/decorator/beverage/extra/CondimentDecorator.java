package decorator.beverage.extra;

import decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription(); //첨가물 데코레이터에서 새로 구현하도록 설계

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
