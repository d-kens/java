package loops;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int number1 = input.nextInt();

        System.out.println("Enter the second integer");
        int number2 = input.nextInt();

        int gcd = 1;

        for (int k = 2; k <= number1 / 2 && k <= number2 / 2; k++) {
            if (number1 % k == 0 && number2 % k == 0)
                gcd = k;
        }

        System.out.println("The GCD for " + number1 + " and " + number2 + " is " + gcd);
    }
}
