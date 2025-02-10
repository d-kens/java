package fundamentals;

import java.util.Scanner;

public class AnalyzingNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int noOfItems = input.nextInt();

        double[] values = new double[noOfItems];
        double sum = 0;

        System.out.println("Enter number");
        for(int i = 0; i < noOfItems; i++) {
           values[i] = input.nextDouble();
           sum += values[i];
        }

        System.out.println(sum);


        double average = sum / noOfItems;

        double[] backup = new double[noOfItems];
        System.arraycopy(values, 0, backup, 0, noOfItems);

        int count = 0;

        for (double value : values) {
            if(value > average) count++;
        }

        System.out.println(" The average for the items is " + average + " and the number of items above average is " + count);


        System.out.println("Backup array values: ");
        for(double value : backup) System.out.print(value + " ");
    }
}
