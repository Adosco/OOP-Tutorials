
//My Dog class
public class Dog {

    int numberOfLegs;
    String furColor;

    //Constructor of the Dog class
    public Dog(int numberOfLeg,String furColor){
        this.numberOfLegs = numberOfLeg;
        this.furColor = furColor;
    }

    public Dog(){
        this.numberOfLegs = 4;
        this.furColor = "White";
    }


    //Methods of the dog class
    public void bark(){
        System.out.println("Dog is barking");

    }

    public void play(){
        System.out.println("Dog is playing");

    }


    public static void main(String[] args){
        //Creating object of the Dog class
        Dog germanShepherd = new Dog();

        //German Shepherd
        System.out.println(germanShepherd.furColor);
        System.out.println(germanShepherd.numberOfLegs);




    }




}