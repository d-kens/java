package oop;

import java.awt.image.CropImageFilter;

public class Circle {

    private double radius = 1;

    private static int numberOfObjects = 0;

    public Circle() {
        numberOfObjects++;
    }

    public Circle(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }


    public static void printAreas(Circle c, int times) {

        System.out.println("Radius \t\t Area");

        while(times >= 1) {
            System.out.println(c.getRadius() + " \t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }


    public static void main(String[] args) {
        Circle circle1 = new Circle(14);

        circle1.setRadius(28);

        System.out.println("Circle Radius is " + circle1.getRadius());

        System.out.println("The area of a circle with radius: " + circle1.radius + " is: " + circle1.getArea());

        System.out.println(new Circle(15).getArea());

        System.out.println(new Circle().getArea());

        System.out.println("Number of circle objects is: " + Circle.getNumberOfObjects());


        Circle circle2 = new Circle();
        int n = 5;

        printAreas(circle2, n);

        System.out.println("The radius for Circle 2 is " + circle2.getRadius());
        System.out.println("n is " + n);


    }
}
