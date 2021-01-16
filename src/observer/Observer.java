package observer;

import pizza.Pizza;

public interface Observer {
    void objectCreated(Pizza pizza);
    void objectModified(Pizza pizza);
}
