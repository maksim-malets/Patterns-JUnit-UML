package facade;

public class ClientFacade {
    private CityValidator cityValidator;
    private ClientTracker clientTracker;
    private MailingList mailingList;

    public ClientFacade(CityValidator cityValidator, ClientTracker clientTracker, MailingList mailingList) {
        this.cityValidator = cityValidator;
        this.clientTracker = clientTracker;
        this.mailingList = mailingList;
    }

    public void activate(){
        clientTracker.clientOn();
        cityValidator.printCity();
        mailingList.sendMail();
    }
}
