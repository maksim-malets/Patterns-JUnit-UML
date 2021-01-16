package pizza;

import java.util.ArrayList;

public class Cheesy extends Pizza {
    public Cheesy(){
        doughType = "thin";
        cheese = true;
        price += 10;
        ingredients = new ArrayList<>();
        ingredients.add("cheese");
    }

    @Override
    public int getPrice() {
        return price;
    }

}
