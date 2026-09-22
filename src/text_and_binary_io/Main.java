package text_and_binary_io;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intValue = input.nextInt();
        double doubleValue = input.nextDouble();
        String line = input.nextLine();

        System.out.println(intValue);
        System.out.println(doubleValue);
        System.out.println("This is the line value: " + line);
    }
}
