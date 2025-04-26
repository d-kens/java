package inheritance_polymorphism;

public class Car extends Vehicle{
    private String model;

    public Car() {
        this.model = "Unknown";
        System.out.println("Car: No-arg constructor called");
    }


    public Car(String type, String model) {
        super(type);
        this.model = model;
        System.out.println("Car: Constructor with type = " + type + ", model = " + model);
    }
}
