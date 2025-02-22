package fundamentals;

public class LinearSearch {
    public static void main(String[] args) {
        int[] values = new int[]{10, 56, 34, 12, 34, 28, 90, 14, 67, 45, 34, 90, 78, 56, 46, 78, 36};

        int searchKey = 90;
        int index = linearSearch(values, searchKey);

        if(index != 1)
            System.out.println("Element " + searchKey + " not found in the array");
        else
            System.out.println("Element " + searchKey + " found at index " + index + " of the list");
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if(key == list[i]) {
                return i;
            }
        }

        return -1;
    }
}
