
//Encapsulation

public class Car {

    private String make;
    private String model;
    private String chassisNumber;
    private String color;

    public Car(String make, String model, String chassisNumber, String color) {
        this.make = make;
        this.model = model;
        this.chassisNumber = chassisNumber;
        this.color = color;
    }

    //Setters of the instance variables
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", chassisNumber='" + chassisNumber + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
