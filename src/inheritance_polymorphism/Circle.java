package inheritance_polymorphism;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void printCircle() {
        System.out.println("The circle is create " + getDateCreated() + " and the radius is " + getRadius());
    }

    public String toString() {
        return super.toString() + "\n radius is " + radius;
    }
}
