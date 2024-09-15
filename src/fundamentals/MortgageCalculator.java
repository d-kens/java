package fundamentals;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner input = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = input.nextFloat();
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = input.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * ((monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
