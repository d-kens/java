package fundamentals;

import com.sun.tools.jconsole.JConsoleContext;

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

        // Finding the smallest index of the largest element
        int maxValue1 = randomValues[0];
        int smallestIndexOfMax = 0;

        for (int i = 0; i < randomValues.length; i++) {
            if(randomValues[i] > maxValue1) {
                maxValue1 = randomValues[i];
                smallestIndexOfMax = i;
            }
        }

        System.out.println("The largest value in the array is " + maxValue1 + " and its smallest index is " + smallestIndexOfMax);


        // Finding the largest index of the largest index
        int maxValue2 = values[0];
        int largestIndexOfMax = 0;


        for (int i = 0; i < values.length; i++) {
            if(values[i] >= maxValue2) {
                maxValue2 = values[i];
                largestIndexOfMax = i;
            }
        }

        System.out.println("The largest value in the array is " + maxValue2 + " and its largest index is " + largestIndexOfMax);



        // Randomly shuffling an array
        int[] myList = {
                69, 29, 1, 92, 29, 50, 79, 67, 99, 58, 84, 4, 76, 58, 21, 8,
                44, 7, 75, 15, 85, 1, 75, 63, 96, 97, 49, 13, 34, 63, 4, 22,
                84, 58, 88, 81, 53, 37, 76, 84, 69, 38, 13, 26, 44, 39, 34, 11,
                0, 40, 54, 43, 45, 96, 54, 42, 1, 52, 99, 81, 38, 96, 95, 33,
                79, 13, 87, 4, 79, 43
        };

        System.out.println("The list before random shuffling");
        for(int value : myList) System.out.print(value + " ");

        for (int i = myList.length - 1; i > 0; i--) {
            int j = (int)(Math.random() * (i + 1));

            int temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }

        System.out.println();
        System.out.println("The list after random shuffling");
        for(int value : myList) System.out.print(value + " ");


        // Shifting Elements one position to the right
        int[] myValues = {10,20,30,40,50,60,70,80,90,100};

        System.out.println("The values before shifting one position to the right");

        for(int value : myValues) System.out.print(value + " ");

        int lastValue = myValues[myValues.length - 1];

        for (int i = myValues.length - 2; i >= 0; i--) {
           myValues[i + 1] = myValues[i];
        }

        myValues[0] = lastValue;

        System.out.println();
        System.out.println("The values after shifting one position to the right");
        for (int value: myValues) System.out.print(value + " ");






    }
}
