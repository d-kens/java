package exception_handling;

import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int number1, int number2) {
        if (number2 == 0)
          throw new ArithmeticException("Divisor cannot be zero");

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();


        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Exception: An integer cannot be divided by zero");
        }

        System.out.println("Execution continues ...");
    }
}

/**
 * try {
 *  Code to run;
 *  A statement or a method that may throw an exception;
 *  More code to run;
 * }
 * catch (type ex) {
 *  Code to process the exception;
 * }
 */
