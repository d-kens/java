package arrays;

public class Main {
    public static void main(String[] args) {
        int[] source = {1, 5, 3, 6, 10, 21};

        int[] target = new int[4];

        System.arraycopy(source, 1, target, 0, 4);

        for (int value : target)
            System.out.println(value);
    }
}