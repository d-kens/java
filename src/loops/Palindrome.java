
/**
 - A string is palindrome if it reads the same forward and backward.
 - For example the words "mom", "dad", "noon" are all palindromes


 Logical solution
 - Check whether the first character in the string is same as the last character.
 - If they are, check if the second character is the same as the second last character.
 - This process continues until a mismatch is found or all the characters in the string are checked, except the middle character if the string has odd number of characters

 - Variables low and high will store the index of the characters in the string that are being compared.
 -

 */







package loops;
public class Palindrome {
    public static void main(String[] args) {

        String string = "noona";
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

        String output = isPalindrome ? string + " is a palindrome." : string + " is not a palindrome";
        System.out.println(output);
    }
}
