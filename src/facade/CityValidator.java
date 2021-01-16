package facade;

public class CityValidator {
    private String city;

    public CityValidator(String city){
        this.city = city;
    }

    public boolean printCity() {
        if ((city.equals("Minsk")) || (city.equals("Moscow"))){
            System.out.println("Your city is + " + city);
            return true;
        }
        else {
            System.out.println("There is now Pizza House in your city, but you can still continue");
            return false;
        }
    }

    public void setCity(String city) {
        this.city = city;
    }
}
