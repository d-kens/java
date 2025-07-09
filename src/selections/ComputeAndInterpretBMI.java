package selections;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.println("Enter your height in inches: ");
        double heightInInches = input.nextDouble();

        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        double heightInMetres = heightInInches * METERS_PER_INCH;

        double bmi = weightInKilograms / (heightInMetres * heightInMetres);

        System.out.println("Your BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
}
