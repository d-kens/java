package fundamentals;

import java.util.Scanner;

public class CheckSudokuSolution {
    public static void main(String[] args) {

        int[][] grid = readSolution();

        System.out.println("........................");

        printSolution(grid);

        System.out.println(isValid(grid) ? "Valid solution" : "invalid solution");

    }

    public static int[][] readSolution() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sudoku puzzle solution: ");
        int[][] grid = new int[9][9];

        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = input.nextInt();
            }
        }

        return grid;
    }

    public static void printSolution(int[][] grid) {
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if((j + 1) % 9 == 0) {
                    System.out.println(grid[i][j]);
                } else {
                    System.out.print(grid[i][j] + " ");
                }
            }
        }
    }


    public static boolean isValid(int[][] grid) {
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < 9; j++)
                if(grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid))
                    return false;
        return true;
    }


    public static boolean isValid(int i, int j, int[][] grid) {
        // check whether grid[i][j] is unique in its column
        for(int column = 0; column < 9; column++)
            if(column != j && grid[i][column] == grid[i][j])
                return false;


        // check whether grid[i][j] is unique in its row
        for(int row = 0; row < 9; row++)
            if(row != i && grid[row][j] == grid[i][j])
                return false;


        // check whether grid[i][j] is unique in the 3 X 3 box
        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
                if(row != i && col != j && grid[i][j] == grid[row][col])
                    return false;

        return true;
    }
}
