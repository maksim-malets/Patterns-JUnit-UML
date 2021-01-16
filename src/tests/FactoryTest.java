package tests;

import factory.PizzaFactory;
import factory.PizzaHouse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pizza.Carbonara;
import pizza.Cheesy;
import pizza.Margherita;
import pizza.PizzaType;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FactoryTest {
    private PizzaType pizzaType;
    private Class expected;

    public FactoryTest(PizzaType pizzaType, Class expected){
        this.pizzaType = pizzaType;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> dataForTest(){

        return Arrays.asList(new Object[][]{
                {PizzaType.CARBONARA, Carbonara.class},
                {PizzaType.CHEESY, Cheesy.class},
                {PizzaType.MARGHERITA, Margherita.class}
        });
    }

    @Test
    public void paramTest() {
        PizzaHouse pizzaHouse = new PizzaHouse(new PizzaFactory());
        assertEquals(expected, pizzaHouse.createPizza(pizzaType).getClass());
    }
}
