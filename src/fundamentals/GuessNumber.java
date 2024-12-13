package fundamentals;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String [] args) {
        int luckyNumber = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        int guess = -1;
        while(guess != luckyNumber) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if(guess == luckyNumber) {
                System.out.println("You are right, the lucky number is: " + luckyNumber);
            } else if (guess > luckyNumber) {
                System.out.println("Guess is too high, Try again ");
            } else {
                System.out.println("Guess is too low, Try again ");
            }

        }
    }
}
