package observer;

import pizza.Pizza;

public class ConcreteObserver implements Observer{
    @Override
    public void objectCreated(Pizza pizza) {
        System.out.println("Prepare pizza" + pizza.toString());
    }

    @Override
    public void objectModified(Pizza pizza) {
    }
}
