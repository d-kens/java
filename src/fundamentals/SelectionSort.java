package fundamentals;

public class SelectionSort {

    public static void main(String[] args) {
        int[] values = new int[]{69, 987, 112, 87654, 98765, 67, 12, 16717, 50, 976, 17636};

        System.out.println(findMin(values));

        selectionSort(values);

        for(int value :  values)
            System.out.print(value + "  ");


    }

    public static void selectionSort(int[] list) {
        for(int i = 0; i < list.length - 1; i++) {
           int currentMinimum = list[i];
           int currentMinIndex = i;

           for(int j = i + 1; j < list.length; j++) {
               if(list[j] < currentMinimum) {
                   currentMinimum = list[j];
                   currentMinIndex = j;
               }
           }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMinimum;
            }
        }
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) min = array[i];
        }

        return min;
    }
}
