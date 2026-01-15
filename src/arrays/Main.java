package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {490, 65, 12, 9, 33, 64, 100};

        Arrays.parallelSort(numbers, 1, 4);

        for (int number : numbers)
            System.out.print(number + " ");

        System.out.println();
        System.out.println();

        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(Arrays.binarySearch(list, 1000));


        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10};
        int[] list3 = {4, 2, 7, 10};

        System.out.println(Arrays.equals(list1, list2));
        System.out.println(Arrays.equals(list2, list3));

        System.out.println(Arrays.toString(list));

        java.util.Arrays.fill(list1, 5);
        java.util.Arrays.fill(list, 1, 5, 100);

        for (int number : list1)
            System.out.print(number + " ");

        System.out.println();

        for (int number : list)
            System.out.print(number + " ");


        String[] messages = {"Wewe ni nani?", "Na unatoka wapi?", "How are you", "Tulikutana wapi", "Abebo"};

        Arrays.sort(messages);

        System.out.println();
        for (String message: messages)
            System.out.println(message);



        int[] list11 = {2, 4, 7, 10};
        java.util.Arrays.fill(list11, 7);
        System.out.println(java.util.Arrays.toString(list11));

        int[] list12 = {2, 4, 7, 10};
        System.out.println(java.util.Arrays.toString(list12));
        System.out.print(java.util.Arrays.equals(list11, list12));


    }
}