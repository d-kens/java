package fundamentals;

public class ThreeDArray {

    public static void main(String[] args) {
        int[][][] numbers = {
                { {1, 2, 3}, {4, 5, 6} },
                { {7, 8, 9}, {10, 11, 12} }
        };


        // iterating through the 3D array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    System.out.println(numbers[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
