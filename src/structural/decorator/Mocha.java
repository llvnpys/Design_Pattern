package structural.decorator;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return beverage.cost() + 0.9;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 모카";
    }
}
