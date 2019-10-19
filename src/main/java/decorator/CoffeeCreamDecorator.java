package decorator;

public class CoffeeCreamDecorator implements CoffeeInterface {

    private CoffeeInterface coffee;

    public CoffeeCreamDecorator(CoffeeInterface coffee) {
        this.coffee = coffee;
    }


    public int price() {
        return this.coffee.price() + 2;
    }

    public String name() {
        return this.coffee.name() + " krem";
    }
}
