package fundamentals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Comparison operators
        int x = 2;
        int y = 3;

        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        // If statement
        int temp = 32;

        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }
        else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");

        int income = 120_000;

        boolean hasHighIncome = (income > 100_000);

        // For Loop
        for (int i = 5; i > 0; i--)
            System.out.println("Hello World " + i);


        // While Loop
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();

            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;

            System.out.println(input);
        }

        // Do While Loop - Ensures the code block runs at least once
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        // For each loop
        String[] fruits = { "Apple", "Mango", "Orange" };

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);
    }
}