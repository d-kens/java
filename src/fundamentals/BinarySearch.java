package fundamentals;

public class BinarySearch {
    public static void main(String[] args) {
        int[] values = new int[]{2,4,7,10,11,45,50,59,60,66,69,70};
        int searchKey = 79;

        int index = binarySearch(values, searchKey);

        if (index < 0)
            System.out.println(searchKey + " not found in the list of values. It should be inserted at index " + (-index - 1) + " to maintain the order of the list");
        else
            System.out.println(searchKey + " found at index " + index + " of the list");
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = low + (high - low) / 2; // Avoid overflowing the max int value

            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }

        return -low - 1; // Correctly returns the negative insertion point
    }
}
