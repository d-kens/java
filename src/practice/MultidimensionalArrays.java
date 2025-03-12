package practice;

public class MultidimensionalArrays {
    public static void main(String[] args) {


        double[][] matrix = {
                {1.5, 2, 3, 4},
                {5.5, 6, 7, 8,},
                {9.5, 1, 3, 1}
        };

        for (int i = 0; i < matrix[0].length; i++) {
            double sum  = sumColumn(matrix, i);

            System.out.println("Sum of the elements at colum " + i + " is " + sum);
        }

        double[][] values = {
                { 1, 2, 3, 4},
                {5, 6.5, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };


        System.out.println("Major diagonal sum " + sumMajorDiagonal(values));
        System.out.println("Minor diagonal sum " + sumMinorDiagonal(values));

    }


    /**
     * Returns the sum of all elements in a specified column
     * @param matrix
     * @param columnIndex
     */
    public static double sumColumn(double[][] matrix, int columnIndex) {
        if(columnIndex >= matrix[0].length) {
            System.out.println("Invalid column index");
            System.exit(0);
        }

        double columnSum = 0;

        for (int row = 0; row < matrix.length; row++)
            columnSum += matrix[row][columnIndex];

        return columnSum;
    }

    /**
     * Returns the sum of all the numbers in the major diagonal in an n X n matrix.
     * @param matrix
     */
    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0;

        for (int row = 0; row < matrix.length; row++)
            sum += matrix[row][row];

        return sum;
    }


    /**
     * Return the sum of all the numbers in the minor diagonal in a n X n matrix
     * @param matrix
     */
    public static double sumMinorDiagonal(double[][] matrix) {
        double sum = 0;

        for(int row = 0;  row < matrix.length; row++)
            sum += matrix[row][matrix.length - 1 - row];

        return  sum;
    }
}
