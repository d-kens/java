package inheritance_polymorphism;

import java.util.Scanner;

public class Triangle extends GeometricObject {

    public static void main(String[] args) {

        /**
         * The sides entered should form a valid triangle
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Enter tringle's side1 length: ");
        double side1 = input.nextDouble();

        System.out.println("Enter tringle's side2 length: ");
        double side2 = input.nextDouble();

        System.out.println("Enter tringle's side3 length: ");
        double side3 = input.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.println("The area of the triangle is: " + triangle.getArea());
        System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());

    }


    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {}

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * Heron's Formula - Allows you to calc the area of triangle give all three sides without needing the hieght or angle's
     */
    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
