package fundamentals;

public class CountLetterInArray {

    public static void main(String[] args) {
        char[] characters = createArray();

        displayArray(characters);

        int[] counts = countLetters(characters);

        // Display counts
        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);
    }

    public static char[] createArray() {
        char[] characters = new char[100];

        for(int i = 0; i < characters.length; i++) {
            characters[i] = getRandomLowerCaseCharacter();
        }

        return characters;
    }

    public static void displayArray(char[] characters) {
        for(int i = 0; i < characters.length; i++) {
            if((i + 1) % 20 == 0) {
                System.out.println(characters[i]);
            } else {
                System.out.print(characters[i] + " ");
            }
        }
    }

    public static int[] countLetters(char[] characters) {
        int[] counts = new int[26];

        for (char character : characters) {
            counts[character - 'a']++;
        }

        return counts;
    }

    public static void displayCounts(int[] counts) {
        for(int i = 0; i < counts.length; i++) {
            if((i + 1) % 10 == 0)
                System.out.println((char)(i + 'a') + ":" + counts[i]);
            else
                System.out.print((char)(i + 'a') + ":" + counts[i] + " ");
        }
    }

    public static char getRandomCharacter(char character1, char character2) {
        return (char) (character1 + Math.random() * (character2 - character1 + 1));
    }

    public static char getRandomLowerCaseCharacter() {
        return getRandomCharacter('a', 'z');
    }

}
