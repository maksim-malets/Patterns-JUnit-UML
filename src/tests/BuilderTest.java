package tests;

import org.junit.Before;
import org.junit.Test;
import pizza.Pizza;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BuilderTest {

    Pizza pizza;

    @Before
    public void setUp() {
        pizza = new Pizza.Builder()
                .withBacon()
                .withCheese()
                .withMushrooms()
                .build();
    }

    @Test
    public void build() {
        ArrayList<String> expectedIngredients = new ArrayList<>();
        expectedIngredients.add("bacon");
        expectedIngredients.add("cheese");
        expectedIngredients.add("mushrooms");
        assertEquals(expectedIngredients, pizza.ingredients);
    }
}
