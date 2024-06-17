package creational.factoryMethod;

public class FactoryMain {
    public static void main(String[] args) {
        // 어느 지점에 주문할 건지 선택.
        PizzaStore nyStore = new NYStylePizzaStore();

        // 어떤 피자를 주문할 건지 선택
        Pizza pizza = nyStore.orderPizza("치즈");
        System.out.println(pizza.getName());
    }
}
