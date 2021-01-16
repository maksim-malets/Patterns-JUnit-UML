package tests;

import factory.PizzaFactory;
import factory.PizzaHouse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pizza.PizzaType;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DecoratorTest {
    private PizzaType pizzaType;
    private int expected;

    public DecoratorTest(PizzaType pizzaType, int expected) {
        this.pizzaType = pizzaType;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> dataForTest() {

        return Arrays.asList(new Object[][]{
                {PizzaType.CARBONARA, 25},
                {PizzaType.CHEESY, 10},
                {PizzaType.MARGHERITA, 15}
        });
    }

    @Test
    public void paramTest() {
        PizzaHouse pizzaHouse = new PizzaHouse(new PizzaFactory());
        assertEquals(expected, pizzaHouse.createPizza(pizzaType).getPrice());
    }
}