package recursion;

public class BinarySearch {

    static void main(String[] args) {

        int[] numbers = {1, 2, 5, 11, 19, 27, 30, 60};

        System.out.println(binarySearch(numbers,3));
        System.out.println(binarySearch(numbers, 60));
        System.out.println(binarySearch(numbers, 1));
        System.out.println(binarySearch(numbers, 11));
        System.out.println(binarySearch(numbers, 200));

        System.out.println("Recursive Binary Search");

        System.out.println(recursiveBinarySearch(numbers, 1));
        System.out.println(recursiveBinarySearch(numbers, 60));
        System.out.println(recursiveBinarySearch(numbers, 11));
        System.out.println(recursiveBinarySearch(numbers, 100));
    }

    public static int recursiveBinarySearch(int[] input, int target) {
        return recursiveBinarySearch(input, 0, input.length - 1, target);
    }

    public static int recursiveBinarySearch(int[] input, int low, int high, int target) {
        if (low > high) // Base case: Target not present
            return -1;

        int mid = low + (high - low) / 2;

        // Target is found
        if (input[mid] == target)
            return mid;

        // Target is smaller, search the left half
        if (input[mid] > target)
            return recursiveBinarySearch(input, low, mid - 1, target);

        // Target is larger, search the right half
        return recursiveBinarySearch(input, mid + 1, high, target);

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
