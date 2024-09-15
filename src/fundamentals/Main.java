package fundamentals;

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

    }
}