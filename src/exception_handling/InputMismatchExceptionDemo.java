package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println("Enter an integer: ");
                int number = input.nextInt(); // will throw InputMismatchException when the input entered is not an integer

                System.out.println("The number entered is " + number);
                continueInput = false;
            } catch (InputMismatchException exception) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                input.nextLine(); // Discard the input
            }

        } while (continueInput);
    }
}
