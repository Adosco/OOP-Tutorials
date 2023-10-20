public class Blacks extends Whites{
    private boolean theyAreCorrupt;

    public Blacks(String hairColor, String eyeColor, String skinColor, String country,boolean theyAreCorrupt) {
        super(hairColor, eyeColor, skinColor, country);
        this.theyAreCorrupt = theyAreCorrupt;
    }



    public boolean isTheyAreCorrupt() {
        return theyAreCorrupt;
    }

    public void setTheyAreCorrupt(boolean theyAreCorrupt) {
        this.theyAreCorrupt = theyAreCorrupt;
    }


    public static void main(String[] args){
        Blacks blacks = new Blacks("black","white","black","Zambia",true);


    }
}
