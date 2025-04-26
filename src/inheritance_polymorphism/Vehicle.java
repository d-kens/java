package inheritance_polymorphism;

public class Vehicle {
    private String type;

    public Vehicle() {
        this.type = "Unknown";
        System.out.println("Vehicle: No-arg constructor called");
    }

    public Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle: Constructor with type = " + type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String describe() {
        return "Vehicle of type: " + type;
    }
}
