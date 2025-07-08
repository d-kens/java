package selections;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int value = input.nextInt();

        if (value % 5 == 0)
            System.out.println("Hi Five");

        if (value % 2 == 0)
            System.out.println("Hi Even");
    }
}
