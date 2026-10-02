package recursion;


/**
 * Factorial of number n is the product of the positive integers less than or equal to n
 * e.g
 *     5! = 5 x 4 x 3 x 2 x 1
 *     4! = 4 x 3 x 2 x 1
 *     3! = 3 x 2 x 1
 *     2! = 2 x 1
 *     1! = 1
 *
 */

import java.util.Scanner;

public class ComputeFactorial {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non negative integer: ");

        int number = input.nextInt();

        System.out.println("The factorial of " + number + " is " + factorial(number));

    }

    public static long factorial(int n) {
        if (n == 0) // Base case
            return 1;
        else
            return n * factorial(n - 1); // Recursive call
    }
}
