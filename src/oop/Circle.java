package oop;

public class Circle {

    public static void main(String[] args) {

        System.out.println("Before creating any circle objects the number of circle object is: " + Circle.getNumberOfCircleObjects());

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

        System.out.println("After creating a couple of circle objects, the number of circle objects is: " + Circle.numberOfCircleObjects);

    }

    private double radius;

    private static int numberOfCircleObjects = 0;

    public Circle() {
        radius = 1;
        numberOfCircleObjects++;
    }

    public Circle(double newRadius) {
        radius = newRadius;
        numberOfCircleObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = (newRadius > 0) ? newRadius : 0;
    }

    public static int getNumberOfCircleObjects() {
        return numberOfCircleObjects;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
