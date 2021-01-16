package tests;

import facade.CityValidator;
import facade.ClientFacade;
import facade.ClientTracker;
import facade.MailingList;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class FacadeTest {

    CityValidator cityValidator;
    ClientFacade clientFacade;

    @Before
    public void setUp() {
        clientFacade = new ClientFacade(new CityValidator(""), new ClientTracker(), new MailingList());
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void printCity() {
        String city = "Moscow";
        cityValidator = new CityValidator(city);
        boolean result = cityValidator.printCity();
        boolean expectedCity = true;
        assertEquals(expectedCity, result);
    }

    @Test
    public void activate() {
        clientFacade.activate();
        expectedException = ExpectedException.none();
    }
}