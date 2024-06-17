package creational.factoryMethod;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if(type.equals("치즈")) return new NYStyleCheesePizza();

        return null;
    }
}
