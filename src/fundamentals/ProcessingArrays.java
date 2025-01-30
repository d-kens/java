package fundamentals;

import java.util.Scanner;

public class ProcessingArrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initialize Array with User Input
        int[] values = new int[10];

        System.out.println("Enter " + values.length + " values: ");

        for(int i = 0; i < values.length; i++)
            values[i] = input.nextInt();

        System.out.println("The numbers keyed in are: ");

        for (int value : values) System.out.print(value + " ");

        // Initialize Array with Random values
        int[] randomValues  = new int[70];

        for(int i = 0; i < randomValues.length; i++)
            randomValues[i] = (int)(Math.random() * 100);

        System.out.println("The random values generated are: ");

        for (int value: randomValues) System.out.print(value + " ");


        // Summing random value elements
        double total = 0;
        for (int value : values) total += value;

        System.out.println();
        System.out.println("The total sum for the random values is " + total);


        // Finding the largest element in an array
        int maxValue = randomValues[0];

        for (int randomValue : randomValues) if (randomValue > maxValue) maxValue = randomValue;

        System.out.println("The maximum value from the randomly generated values is: " + maxValue);

    }
}
