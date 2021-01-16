package memento;

import java.util.ArrayList;

public class Memento {

    private ArrayList<String> ingredients;

    public Memento(ArrayList<String> ingredients){
        this.ingredients = ingredients;
    }

    public ArrayList<String> getState(){
        return ingredients;
    }
}
