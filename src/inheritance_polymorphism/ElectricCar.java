package inheritance_polymorphism;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar() {
        this.batteryCapacity = 0;
        System.out.println("Electric car: No-args constructor called");
    }

    public ElectricCar(String type, String model, int batteryCapacity) {
        super(type, model);
        this.batteryCapacity = batteryCapacity;
        System.out.println("ElectricCar: Constructor with type = " + type + ", model = " + model + ", batteryCapacity = " + batteryCapacity);
    }



    public static void main(String[] args) {
        System.out.println("=== Creating ElectricCar with no-arg constructor ===");
        ElectricCar electricCar1 = new ElectricCar();

        System.out.println("\n=== Creating ElectricCar with parameterized constructor ===");
        ElectricCar electricCar2 = new ElectricCar("Electric", "Tesla Model S", 100);
    }
}
