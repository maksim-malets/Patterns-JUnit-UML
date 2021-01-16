package pizza;

import java.util.ArrayList;

public class Carbonara extends Pizza {
    public Carbonara(){
        doughType = "thin";
        mushrooms = true;
        cheese = true;
        tomatoes = true;
        bacon = true;
        price += 25;
        ingredients = new ArrayList<>();
        ingredients.add("mushrooms");
        ingredients.add("cheese");
        ingredients.add("tomatoes");
        ingredients.add("bacon");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
