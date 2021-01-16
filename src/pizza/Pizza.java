package pizza;

import decorator.PriceDecorator;
import memento.Memento;
import observer.ConcreteObserver;

import java.util.ArrayList;

public class Pizza extends PriceDecorator {

    protected String doughType;
    protected boolean ham;
    protected boolean bacon;
    protected boolean cheese;
    protected boolean tomatoes;
    protected boolean mushrooms;
    protected String sauce;
    public ArrayList<String> ingredients = null;


    public String getDoughType() {
        return doughType;
    }

    public void setDoughType(String doughType) {
        this.doughType = doughType;
    }

    public boolean isHam() {
        return ham;
    }

    public void setHam(boolean ham) {
        this.ham = ham;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(boolean tomatoes) {
        this.tomatoes = tomatoes;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public static class Builder{

        private ConcreteObserver concreteObserver = new ConcreteObserver();
        private Pizza newPizza;

        public Builder(){
            newPizza = new Pizza();
            newPizza.ingredients = new ArrayList<>();
            newPizza.price = 5;
        }

        public Builder doughType(String doughType){
            newPizza.doughType = doughType;
            return this;
        }

        public Builder withBacon(){
            newPizza.bacon = true;
            newPizza.price += 7;
            newPizza.ingredients.add("bacon");
            return this;
        }
        public Builder withCheese(){
            newPizza.cheese = true;
            newPizza.price += 10;
            newPizza.ingredients.add("cheese");
            return this;
        }
        public Builder withTomatoes(){
            newPizza.tomatoes = true;
            newPizza.price += 3;
            newPizza.ingredients.add("tomatoes");
            return this;
        }
        public Builder withMushrooms(){
            newPizza.mushrooms = true;
            newPizza.price += 4;
            newPizza.ingredients.add("mushrooms");
            return this;
        }
        public Builder withHam(){
            newPizza.ham = true;
            newPizza.price += 7;
            newPizza.ingredients.add("ham");
            return this;
        }

        public Builder withSauce(String sauce){
            newPizza.sauce = sauce;
            newPizza.price += 2;
            newPizza.ingredients.add("sauce");
            return this;
        }

        public Pizza build(){
            concreteObserver.objectCreated(newPizza);
            return newPizza;
        }
    }

    public void setMemento(Memento memento){
        ingredients = memento.getState();
    }

    public Memento getMemento(){
        System.out.println(ingredients);
        return new Memento(ingredients);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "doughType='" + doughType + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
