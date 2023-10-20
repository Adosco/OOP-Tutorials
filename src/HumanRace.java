
public class HumanRace {

    //Instance variables or Field names
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    String dish;
    String accent;

    public HumanRace(String hairColor,String eyeColor,String skinColor){
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.skinColor = skinColor;

    }

    public HumanRace(){
        this.accent = "Slur";
        this.dish = "Grains";
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }


    /*
    public static void main(String[] args){
        HumanRace blacks = new HumanRace();


        HumanRace whites = new HumanRace("blonde","blue","white");

        String hairColor = whites.getHairColor();
        String eyeColor = whites.getEyeColor();
        String skinColor = whites.getSkinColor();

        String [] attributes = {hairColor,eyeColor,skinColor};



        for(int i=0; i< attributes.length; i++){
            System.out.println(attributes[i]);

        }




    }
     */
}
