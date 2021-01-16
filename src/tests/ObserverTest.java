package tests;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import pizza.Pizza;

public class ObserverTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void checkObserver(){
        Pizza pizza = new Pizza.Builder()
                .doughType("thick")
                .withBacon()
                .withCheese()
                .withMushrooms()
                .build();
        expectedException = ExpectedException.none();
    }
}
