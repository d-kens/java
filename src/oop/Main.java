package oop;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight in pounds: ");
        double weight = input.nextDouble();

        System.out.println("Enter the height in inches: ");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        Course course1 = new Course("Data Structures");

        course1.addStudents("Onyango Dickens");
        course1.addStudents("Jane Achola");
        course1.addStudents("Luke Enos");

        System.out.println("The number of students in " +
                course1.getCourseName() + " is " + course1.getNumberOfStudents());

        String[] course1Students = course1.getStudents();
        for (String student : course1Students) {
            System.out.println(student + ", ");
        }

        String s1 = "Welcome to Java";
        String s2 = s1.replace("o", "abc");
        System.out.println(s1);
        System.out.println(s2);
    }
}
