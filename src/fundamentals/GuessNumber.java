package fundamentals;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String [] args) {
        int luckyNumber = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 100");


        int guess = -1;
        while(guess != luckyNumber) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if(guess == luckyNumber) {
                System.out.println("Yes, the lucky number is: " + luckyNumber);
            } else if (guess > luckyNumber) {
                System.out.println("Your guess is to high");
            } else {
                System.out.println("Your guess is too low.");
            }
        }


    }
}
