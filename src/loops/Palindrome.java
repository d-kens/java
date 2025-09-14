
/**
 - A string is palindrome if it reads the same forward and backward.
 - For example the words "mom", "dad", "noon" are all palindromes


 Logical solution
 - Check whether the first character in the string is same as the last character.
 - If they are, check if the second character is the same as the second last character.
 - This process continues until a mismatch is found or all the characters in the string are checked, except the middle character if the string has odd number of characters

 - Variables low and high will store the indices of the characters in the string that are being compared.
        - low starts at the first character (index 0)
        - high starts at the last character (index string.length() - 1)
 - In each iteration:
    - Compare the characters at low and high
    - If they are not equal the string is not a palindrome and the loop can stop
    - If they are equal, increment low and decrement high to move towards the middle of the string
 - The loop terminates when low is no longer less than high
    - If no mismatches wre found by this point, the string is a palindrome
    - Otherwise, it is not a palindrome

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
