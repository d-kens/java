package ElementaryProgramming;

import java.util.Scanner;

public class SalesTax {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is " + (int)(tax * 100) / 100.0);
    }
}
