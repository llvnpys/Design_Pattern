package structural.decorator;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return beverage.cost() + 3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 우유";
    }
}
