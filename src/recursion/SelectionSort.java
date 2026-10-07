package recursion;

public class SelectionSort {

    static void main() {

        int[] sortedValues = selectionSort(new int[] {30, 27, 19, 60, 11, 2, 5});

        for (int value : sortedValues)
            System.out.print(value + " ");

        System.out.println();

        int[] values = {30, 27, 19, 60, 11, 2, 5};
        recursiveSelectionSort(values);

        for (int value : values)
            System.out.print(value + " ");

    }



    /**
     * Selection Sort
     *  - Find the smallest element in a list and swap it with the first element
     *  - It then finds the smallest element remaining and swaps it with the first element in the remaining list.
     *  - Do this until the remaining list contains only a single element.
     */
    public static int[] selectionSort(int[] input) {
        int[] values = input.clone();

        for (int i = 0; i < values.length - 1; i++) {
            int smallestValue = values[i];
            int smallestValueIndex = i;

            for (int k = i + 1; k < values.length; k++) {
                if (smallestValue > values[k]) {
                    smallestValue = values[k];
                    smallestValueIndex = k;
                }
            }

            if (smallestValueIndex != i) {
                int temp = values[i];
                values[i] = smallestValue;
                values[smallestValueIndex] = temp;
            }
        }

        return values;
    }


    public static void recursiveSelectionSort(int[] values) {
        recursiveSelectionSort(values, 0);
    }

    private static void recursiveSelectionSort(int[] values, int startingIndex) {
        if (startingIndex < values.length - 1) {
            int smallestValue = values[startingIndex];
            int smallestValueIndex = startingIndex;

            for (int k = startingIndex + 1; k < values.length; k++) {
                if (smallestValue > values[k]) {
                    smallestValue = values[k];
                    smallestValueIndex = k;
                }
            }

            if (smallestValueIndex != startingIndex) {
                int temp = values[startingIndex];
                values[startingIndex] = smallestValue;
                values[smallestValueIndex] = temp;
            }
            recursiveSelectionSort(values, startingIndex + 1);
        }
    }

}
