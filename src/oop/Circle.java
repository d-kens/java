package oop;

public class Circle {

    public static void main(String[] args) {
        // Create a circle with radius 1
        Circle circle1 = new Circle();
        System.out.println("The area of the circle with radius: " +
                circle1.radius + " is: " + circle1.getArea());

        // Create a circle with radius 25
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle with radius: " +
                circle2.radius + " is: " + circle2.getArea());

        // Create a circle with radius 125
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle with radius: " +
                circle3.radius + " is: " + circle3.getArea());

        // Modify the radius
        circle2.setRadius(100);
        System.out.println("The area of the circle with radius: " +
                circle2.radius + " is: " + circle2.getArea());
    }

    double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
