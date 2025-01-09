public class ProcessingArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 41, 91, 39, 23, 91, 84, 29};

        numbers = shift(numbers);

        for (int number : numbers) System.out.print(number + " ");
    }


    public static int[] shift(int[] numbers) {
        int[] result = new int[numbers.length];

        System.arraycopy(numbers, 0, result, 0, numbers.length);

        int temp = numbers[numbers.length - 1];

        for (int i = result.length - 1; i > 0; i--) {
            result[i] = result[i - 1];
        }

        result[0] = temp;

        return result;
    }
}
