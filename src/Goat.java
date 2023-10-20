public class Goat extends Animals{
    String color;
    public Goat(String name,String color){
        super(name);
        this.color = color;
    }

    @Override
    public void makeSound(){
        System.out.println("Meeeeeiii");
    }

    @Override
    public String toString() {
        return "Goat{" +
                "color='" + color + '\'' +
                '}';
    }
}
