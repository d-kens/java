package fundamentals;

import java.util.Scanner;

public class Processing2DArrays {
    public static void main(String[] args) {

        int[][] matrix = initializeWithInputValues();

        // Display the matrix
        System.out.println("Matrix values:");
        printMatrix(matrix);

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


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }



}
