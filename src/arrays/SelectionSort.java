package arrays;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSort(new double[] {100, 10, 45, 23, 17,3, 89, 50, 12, 22});
    }

    public static void selectionSort(double[] list) {

        for (int i = 0; i < list.length; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++)
                if (list[j] < currentMin) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }

        }

        for (double value : list)
            System.out.println(value + " ");
    }
}