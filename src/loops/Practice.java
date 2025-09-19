package loops;

public class Practice {
    public static void main(String[] args) {
        System.out.println(longestPrefix("abc", "axc"));
        System.out.println(longestPrefix("hello", "world"));
        System.out.println(longestPrefix("Python", "Pythonic"));
        System.out.println(longestPrefix("Welcome to C++", "Welcome to programming"));
    }


    /**
         * Algorithm:  Find the Longest Common Prefix Between Two String
           Input: Two strings string1 and string2
           Output: The longest common prefix of the two strings

         * Steps
         1. Initialize an empty string commonPrefix.
         2. Loop through the characters of both strings simultaneously, using an index i
            Continue looping while i < string1.length() and i < string2.length()
         3. At each iteration
            - If the character at string1[i] is the same as string2[2], append that character to commonPrefix
            - Else (characters don't match) stop the loop (break)
         4. Return the commonPrefix

     */
    public static String longestPrefix(String string1, String string2) {

        String commonPrefix = "";

        for (int i = 0; i < string1.length() && i < string2.length(); i++) {
            if (string1.charAt(i) == string2.charAt(i)) {
                commonPrefix += string1.charAt(i);
            } else {
                break;
            }
        }

        return commonPrefix;
    }
}