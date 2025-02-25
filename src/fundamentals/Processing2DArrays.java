package fundamentals;

import java.util.Scanner;

public class Processing2DArrays {
    public static void main(String[] args) {

        int[][] matrix = initializeWithInputValues();

        // Display the matrix
        System.out.println("Matrix values:");
        printMatrix(matrix);

        System.out.println();
        int[][] matrix2 = initializingWithRandomValues();
        printMatrix(matrix2);

        System.out.println();
        int matrix2Sum = sumMatrix(matrix2);
        System.out.println(matrix2Sum);

        System.out.println();
        sumColumns(matrix);

    }


    public static int[][] initializeWithInputValues() {
        java.util.Scanner input = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter " + matrix.length + " row and " + matrix[0].length + " columns");

        for(int row = 0; row < matrix.length; row++) {
            for (int column =  0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }


        return matrix;
    }

    public static int[][] initializingWithRandomValues() {
        int[][] matrix = new int[10][10];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() * 100);
            }
        }

        return matrix;
    }

    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
        }

        return sum;
    }

    public static void sumColumns(int[][] matrix) {
        for (int column = 0; column < matrix[0].length; column++) {
            int colSum = 0;

            for(int row = 0; row < matrix.length; row++)
                colSum += matrix[row][column];

            System.out.println("The total sum for column " + column + " is: " + colSum);
        }
    }


    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }



}
