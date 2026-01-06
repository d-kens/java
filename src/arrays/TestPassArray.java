package arrays;

public class TestPassArray {
    public static void main(String[] args) {
        int[] list = {1, 2};

        System.out.println("Before invoking swap: ");
        System.out.println("Array is {" + list[0] + ", " + list[1] + "}");
        swap(list[0], list[1]);
        System.out.println("After invoking swap: ");
        System.out.println("Array is {" + list[0] + ", " + list[1] + "}");


        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("Array is {" + list[0] + ", " + list[1] + "}");
        swapFirstTwoInArray(list);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("Array is {" + list[0] + ", " + list[1] + "}");

        int[] values = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] valuesReversed = reverse(values);
        for (int value : valuesReversed)
            System.out.print(value + " ");


        System.out.println();

        int[] test = {1, 2, 3, 4, 5};

        for (int i = 0, j = test.length - 1; i < j; i++, j--) {
            int temp = test[i];
            test[i] = test[j];
            test[j] = temp;
        }

        for (int value : test)
            System.out.print(value + " ");

    }

    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--)
            result[j] = list[i];

        return result;
    }
}