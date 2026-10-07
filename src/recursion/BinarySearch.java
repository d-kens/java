package recursion;

public class BinarySearch {

    static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1, 2, 5, 11, 19, 27, 30, 60}, 3));
        System.out.println(binarySearch(new int[] {1, 2, 5, 11, 19, 27, 30, 60}, 60));
        System.out.println(binarySearch(new int[] {1, 2, 5, 11, 19, 27, 30, 60}, 1));
        System.out.println(binarySearch(new int[] {1, 2, 5, 11, 19, 27, 30, 60}, 11));
        System.out.println(binarySearch(new int[] {1, 2, 5, 11, 19, 27, 30, 60}, 200));
    }

    public static int binarySearch(int[] input, int target) {
        int low = 0;
        int high = input.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (input[middle] < target)
                low = middle + 1;
            else if (input[middle] > target)
                high = middle - 1;
            else
                return middle;
        }

        return -1;
    }
}
