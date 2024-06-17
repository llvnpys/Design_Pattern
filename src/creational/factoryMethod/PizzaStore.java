package creational.factoryMethod;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // 객체 생성은 서브 클래스에게 위임.
    abstract Pizza createPizza(String type);
}
