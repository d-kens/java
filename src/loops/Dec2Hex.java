package loops;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = input.nextInt();

        String hex = "";

        while (decimal != 0) {
            int  hexValue = decimal % 16;

            // Convert the digit to decimal value


            hex = hexValue + hex;

            decimal /= 16;
        }

        System.out.println(hex);

    }
}
