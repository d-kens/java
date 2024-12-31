package fundamentals;

import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to check whether its a palindrome: ");

        String string = input.nextLine().toLowerCase();

        System.out.println("String: " + string);

        int low = 0;
        int high = string.length() - 1;


        boolean isPalindrome = true;

        while (low < high) {

            if (string.charAt(low) != string.charAt(high)) {
                isPalindrome = false;
                break;
            }

            low++;
            high--;
        }

        if(isPalindrome) {
            System.out.println(string + " is a palindrome");
        } else {
            System.out.println(string + " is not a palindrome");
        }
    }
}
