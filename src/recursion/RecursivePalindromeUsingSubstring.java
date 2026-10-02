package recursion;

public class RecursivePalindromeUsingSubstring {

    static void main(String[] args) {
        System.out.println("Is racecar a palindrome? " + isPalindrome("racecar"));
        System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
        System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
        System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
    }

    public static boolean isPalindrome(String s) {
        // Base cases: The two end characters are different, and the string size is 0 or 1.
        // In case 1, the string is not a palindrome, in case 2 the string is a palindrome

        if (s.length() <= 1) {
            return true;
        } else if (s.charAt(0) != s.charAt(s.length() -1)) {
            return false;
        } else {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
    }
}
