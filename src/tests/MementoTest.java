package tests;

import memento.Originator;
import org.junit.Before;
import org.junit.Test;
import pizza.Pizza;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class MementoTest {

    Pizza pizza;
    Originator originator;

    @Before
    public void setUp() throws Exception {
        pizza = new Pizza.Builder()
                .doughType("thick")
                .withBacon()
                .withCheese()
                .withMushrooms()
                .build();
        originator = new Originator();
    }

    @Test
    public void checkState(){
        originator.saveState(pizza);
        ArrayList<String> expectedIngredients = pizza.ingredients;
        pizza.ingredients = null;
        originator.loadState(pizza);
        ArrayList<String> ingredients = pizza.ingredients;
        assertEquals(expectedIngredients, ingredients);
    }
}