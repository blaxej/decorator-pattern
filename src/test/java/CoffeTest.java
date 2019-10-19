import decorator.CoffeWithMilkDecorator;
import decorator.Coffee;
import decorator.CoffeeCreamDecorator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CoffeTest {

    @Test
    public void shouldIncreasedPrince() {
        //given
        Coffee coffee = new Coffee();
        CoffeeCreamDecorator coffeeCreamDecorator = new CoffeeCreamDecorator(coffee);

        int price = coffeeCreamDecorator.price();
        //when

        Assertions.assertEquals(4, price);

    }
    @Test
    public void shouldIncreasedPrinceCoffeeMilk() {
        //given
        Coffee coffee = new Coffee();
        CoffeWithMilkDecorator coffeWithMilkDecorator = new CoffeWithMilkDecorator(coffee);

        int price = coffeWithMilkDecorator.price();
        //when

        Assertions.assertEquals(5, price);

    }
    @Test
    public void shouldNameCoffeeIsOk() {
        //given
        Coffee coffee = new Coffee();
        CoffeeCreamDecorator coffeeCreamDecorator = new CoffeeCreamDecorator(coffee);

        String name = coffeeCreamDecorator.name();
        //when

        Assertions.assertEquals(" krem", name);

    }



}
