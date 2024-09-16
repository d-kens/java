package fundamentals;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Value: ");
        int value = input.nextInt();

        if (value % 5 == 0 && value % 3 == 0)
            System.out.println("FizzBuzz");
        else if (value % 5 == 0)
            System.out.println("Fizz");
        else if (value % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(value);
    }

}
