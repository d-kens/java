package oop;

import java.util.Scanner;

public class Location {
    public int row;
    public int column;
    public double maxValue = 0;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }


    public static Location locateLargest(double[][] array) {

        int maxRow = 0, maxColumn = 0;
        double maxVal = array[0][0];

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] > maxVal) {
                    maxVal = array[row][column];
                    maxRow = row;
                    maxColumn = column;
                }
            }
        }

        return new Location(maxRow, maxColumn, maxVal);

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the arrays: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        double[][] array = new double[rows][columns];

        System.out.println("Enter the array: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = scanner.nextDouble();
            }
        }

        Location largestLocation = Location.locateLargest(array);


        System.out.println("The location of the largest element is " + largestLocation.maxValue + "at (" + largestLocation.row + ", " + largestLocation.column + ")");
    }
}
