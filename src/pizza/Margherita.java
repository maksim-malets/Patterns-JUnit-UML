package pizza;

import java.util.ArrayList;

public class Margherita extends Pizza {
    public Margherita(){
        doughType = "thin";
        tomatoes = true;
        cheese = true;
        ham = true;
        price += 15;
        ingredients = new ArrayList<>();
        ingredients.add("tomatoes");
        ingredients.add("cheese");
        ingredients.add("ham");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
