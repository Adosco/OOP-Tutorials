
abstract public class Animals {
    private String name;

    public Animals(String name){
        this.name = name;

    }

    //Abstract method
    abstract void makeSound();

    //Regular method
    public String getName(){
        return  name;
    }



}
