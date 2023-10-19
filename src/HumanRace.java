
public class HumanRace {

    //Instance variables or Field names
    private String hairColor;
    private String skinColor;
    private String accent;
    String dish;
    String eyeColor;

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

    public String getAccent() {
        return accent;
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }


    public static void main(String[] args){
        HumanRace blacks = new HumanRace();
        System.out.println(blacks.accent);
    }
}
