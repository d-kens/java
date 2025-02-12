package fundamentals;

public class PassByValue {
    public static void main(String[] args) {

        int x = 50;
        int[] y = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        updateValues(x, y);

        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);
    }

    public static void updateValues(int number, int[] numbers) {
        number = 1000;
        numbers[0] = 1000;
    }
}
