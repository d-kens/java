package loops;

import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int correctCount = 0;
        long startTime = System.nanoTime();
        String output = "";

        while (count < 5) {
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }


            System.out.println("What is " + number1 + " - " + number2 + ": ");
            int answer = input.nextInt();

            if (number1 - number2 == answer) {
                correctCount++;
                System.out.println("You are correct!!");
            } else {
                System.out.println("You are wrong!!");
                System.out.println(number1  + " - " + number2 + " is " + (number1 - number2));
            }

            count++;
            output += "\n" + number1 + " - " + number2 + " = " + answer + " " + ((number1 - number2 == answer) ? "correct" : "wrong");
        }


        long endTime = System.nanoTime();
        long testTime = endTime - startTime;

        System.out.println();
        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1e-9 + " seconds\n" + output);
    }
}
