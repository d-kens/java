package oop;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphaNumeric {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = input.nextLine();

        System.out.println("ignoring nonalphanumeric characters, \n is " + string + " a palindrome? " + isPalindrome(string));

    }

    public static boolean isPalindrome(String string) {
        String filteredString = filter(string);

        String reversedString = reverse(filteredString);

        return reversedString.equals(filteredString);
    }


    public static String filter(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetterOrDigit(string.charAt(i))) stringBuilder.append(string.charAt(i));
        }

        return stringBuilder.toString();
    }

    public static String reverse(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
