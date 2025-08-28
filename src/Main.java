import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to find its smallest factor other than 1");
        int number = input.nextInt();
        int factor = 2;

        while (number % factor != 0)
            factor++;

        System.out.println("The smallest factor other than one is: " + factor);
    }

}
