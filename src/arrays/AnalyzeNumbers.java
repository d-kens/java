package arrays;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = input.nextInt();
        double[] values = new double[n];
        double sum = 0;

        System.out.println("Enter the value: ");

        for (int i = 0; i < n; i++) {
            values[i] = input.nextInt();
            sum += values[i];
        }

        double average = sum / n;

        int count = 0;

        for (double value : values)
            if (value > average)
                count++;


        System.out.println("The average is: " + average);
        System.out.println("The number of elements above average is: " + count);

    }
}
