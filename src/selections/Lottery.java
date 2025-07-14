package selections;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int lottery = (int)(Math.random() * 100);

        System.out.println("Enter your lottery pick (two digits)");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("Your guess is: " + guess);
        System.out.println("The luck number digit is: " + lottery);

        boolean reverseMatch = lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1;
        boolean singleDigitMatch =
                lotteryDigit1 == guessDigit1 ||
                lotteryDigit1 == guessDigit2 ||
                lotteryDigit2 == guessDigit1 ||
                lotteryDigit2 == guessDigit2;


        if (guess == lottery)
            System.out.println("Exact match. You win $10, 000");
        else if (reverseMatch) {
            System.out.println("Match all digits: you win $3,000");
        } else if (singleDigitMatch)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry. No match!");
    }
}
