/**
 * The Program does the following:
  1. Generate 100 lowercase letters randomly and assign them to an array of characters
  2. Count the occurrence of each letter in the array. To do so, create an array, say counts of 26 int values, each of which counts the occurrences of a letter;
 */

package arrays;

public class CountingLettersInArray {
    public static void main(String[] args) {
        char[] chars = createArray();

        System.out.println("The lowercase letters are: ");
        displayArray(chars);

        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("The occurrences of each letter are: ");
        displayCounts(counts);
    }

    public static char[] createArray() {
        char[] chars = new char[100];

        for (int i = 0; i < chars.length; i++)
            chars[i] = (char)('a' + Math.random() * ('z' - 'a' + 1));

        return chars;

    }

    public static void displayArray(char[] chars) {
        // Display 20 characters per line
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }

    /**
     1. Given an array of lowercase letters and we want to know how many times each letter appear in the array.
     2. The result is an array of 26 integers:
            index 0 -> counts of 'a'
            index 1 -> counts of 'b'
            index 25 -> counts of 'z'
     3. We count by mapping the letters into array indices 0 -25
     */
    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];

        for (char c : chars)
            counts[c - 'a']++;

        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            String letterAndCount = (char)(i + 'a') + " " + counts[i];

            if ((i + 1) % 10 == 0)
                System.out.println(letterAndCount);
            else
                System.out.print(letterAndCount + " ");
        }
    }
}
