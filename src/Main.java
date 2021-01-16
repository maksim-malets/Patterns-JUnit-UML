import facade.CityValidator;
import facade.ClientFacade;
import facade.ClientTracker;
import facade.MailingList;
import factory.PizzaFactory;
import factory.PizzaHouse;
import memento.Originator;
import pizza.Pizza;
import pizza.PizzaType;

public class Main {
    public static void main(String[] args) {

        //facade
        ClientTracker clientTracker = new ClientTracker();
        CityValidator cityValidator = new CityValidator("New York");
        MailingList mailingList = new MailingList();
        new ClientFacade(cityValidator, clientTracker, mailingList).activate();

        //factory, builder
        PizzaHouse pizzaHouse = new PizzaHouse(new PizzaFactory());
        Pizza pizza = pizzaHouse.createPizza(PizzaType.CARBONARA);
        Pizza pizza1 = new Pizza.Builder()
                .doughType("thick")
                .withBacon()
                .withCheese()
                .withMushrooms()
                .build();

        //memento
        Originator originator = new Originator();
        originator.saveState(pizza);
        System.out.println(pizza);
        pizza.ingredients = null;
        originator.loadState(pizza);
        System.out.println(pizza.ingredients);

        //decorator
        System.out.println(pizza1);
        System.out.println("pizza price is " + pizza.getPrice());
        System.out.println("pizza price is " + pizza1.getPrice());
        System.out.println(pizza1.ingredients);

    }
}
