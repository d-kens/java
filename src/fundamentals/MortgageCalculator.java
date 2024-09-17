package fundamentals;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterestRate = 0;
        int numberOfPayments = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = input.nextInt();

            if (principal >= 100 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 100000");
        }


        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterestRate = input.nextFloat();

            if (annualInterestRate >= 1 && annualInterestRate <= 30) {
                monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }

            System.out.println("Enter a value between 1 and 30");
        }


        while (true) {
            System.out.print("Period (Years): ");
            byte years = input.nextByte();

            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }

            System.out.println("Enter a value between 1 and 30");

        }



        double mortgage = principal * ((monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
