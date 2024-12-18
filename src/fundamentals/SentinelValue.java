package fundamentals;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        // Read the initial input
        System.out.print("Enter an integer (Input ends if it is 0): ");
        int data = input.nextInt();

        // Continue reading until data is 0
        int sum = 0;
        while(data != 0) {
            sum += data;

            System.out.print("Enter an integer (Input ends if it is 0): ");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}
