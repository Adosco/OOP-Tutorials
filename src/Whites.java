
public class Whites extends HumanRace {
    private String country;

    public Whites(String hairColor,String eyeColor,String skinColor,String country){

        super(hairColor,eyeColor,skinColor);
        this.country = country;


    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
