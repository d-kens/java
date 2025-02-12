import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 200;
        int[] y = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        update(x, y);

        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);
    }


    public static void update(int number, int[] numbers) {

        number = 1000;
        numbers[0] = number;
    }


}