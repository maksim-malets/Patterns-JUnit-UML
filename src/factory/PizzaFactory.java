package factory;

import pizza.*;

public class PizzaFactory {
    public Pizza createPizza(PizzaType pizzaType){
        Pizza pizza = null;

        switch (pizzaType){
            case MARGHERITA:
                pizza = new Margherita();
                break;
            case CARBONARA:
                pizza = new Carbonara();
                break;
            case CHEESY:
                pizza = new Cheesy();
                break;
        }
        return pizza;
    }

}
