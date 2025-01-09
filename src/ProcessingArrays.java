public class ProcessingArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 41, 91, 39, 23, 91, 84, 29};

        int max = numbers[0];
        int indexOfMax = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                indexOfMax = i;
            }
        }

        System.out.println("The maximum number in the array is: " + max + " and its smallest index is: " + indexOfMax);


        int temp = numbers[numbers.length - 1];

        for (int i = numbers.length - 1;  i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        numbers[0] = temp;



        for (int number : numbers) System.out.print(number + " ");
    }


    public static int[] shift(int[] numbers) {
        return new int[numbers.length];
    }
}
