package oop;

import java.util.Date;

public class Main {
    public static void main(String [] args) {
        Student student = new Student();
        System.out.println("name: " + student.name);
        System.out.println("age: " + student.age);
        System.out.println("is science major: " + student.isScienceMajor);
        System.out.println("gender: " + student.gender);

        Date date = new Date();
        System.out.println("The elapsed time since Jan 1, 1970 is " + date.getTime() + " milliseconds");
        System.out.println(date.toString());


        Circle[] circles = createCircleArray();
        printCircleArray(circles);
    }


    // Create an array of Circle Objects
    public static Circle[] createCircleArray() {
        Circle[] circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(Math.random() * 100);
        }
        return circles;
    }

    public static void printCircleArray(Circle[] circles) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circles.length; i++) {
            System.out.printf("%-30f%-15f\n", circles[i].getRadius(),
                    circles[i].getArea());
        }
        System.out.println("— — — — — — — — — — — — — — — — — — — — — — — — — — — —");
        System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circles));
    }

    public static double sum(Circle[] circleArray) {
        // Initialize sum
        double sum = 0;
        // Add areas to sum
        for (int i = 0; i < circleArray.length; i++)
            sum += circleArray[i].getArea();
        return sum;
    }
}

class Student {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;
}
