package loops;

public class TestForLoop {
    public static void main(String[] args) {

        long sum = 0;
        for (int i = 0; i < 10000; i++) sum += i;

        System.out.println("The sum is: " + sum);
    }
}
