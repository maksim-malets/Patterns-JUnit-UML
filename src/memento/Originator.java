package memento;

import pizza.Pizza;

public class Originator {
    private Memento memento;

    public void saveState(Pizza pizza) {
        memento = pizza.getMemento();
    }

    public void loadState(Pizza pizza){
        pizza.setMemento(memento);
    }
}
