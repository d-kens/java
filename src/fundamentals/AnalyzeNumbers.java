package fundamentals;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items: ");

        int numberOfItems = input.nextInt();

        double[] numbers = new double[numberOfItems];
        double sum = 0;

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < numberOfItems; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / numberOfItems;

        int count = 0;

        for (double number : numbers) {
            if (number > average) {
                count++;
            }
        }

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is: " + count);

    }
}
