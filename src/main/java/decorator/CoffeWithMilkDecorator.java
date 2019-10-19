package decorator;

public class CoffeWithMilkDecorator implements CoffeeInterface {

    private CoffeeInterface coffee;

    public CoffeWithMilkDecorator(CoffeeInterface coffee) {
        this.coffee = coffee;
    }


    public int price() {
        return this.coffee.price() + 3;
    }

    public String name() {
        return this.coffee.name() + " z mlekiem";
    }




}
