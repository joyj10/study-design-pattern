package structural.decorator.beverage;

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI}
    private Size size = Size.TALL;
    protected String description = "";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
