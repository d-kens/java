package loops;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        System.out.println("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (answer != (number1 + number2)) {
            System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }


        System.out.println("You got it!");

    }
}
