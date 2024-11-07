package fundamentals;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String [] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area;

        area = radius * radius * PI;

        System.out.println("The area of a circle with radius: " + radius + " is: " + area);
    }
}
