package arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int[] values = {10, 40, 22, 13, 11, 103, 190, 9, 171};

        System.out.println(linearSearch(values, 100));
        System.out.println(linearSearch(values, 10));
        System.out.println(linearSearch(values, 13));
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++)
            if (key == list[i])
                return i;
        return -1;
    }
}