package factory;

import pizza.Pizza;
import pizza.PizzaType;

public class PizzaHouse{

    private final PizzaFactory pizzaFactory;

    public PizzaHouse(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza createPizza(PizzaType pizzaType){ return pizzaFactory.createPizza(pizzaType);
    }
}
