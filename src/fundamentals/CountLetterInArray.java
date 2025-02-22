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


        // Practice implementation
        char[] characters2 = new char[]{
                'r', 'e', 't', 'y', 'u', 'i', 'o', 'p', 'i', 'u', 'y', 't', 'r', 'e', 'w', 's',
                'd', 'f', 'g', 'h', 'j', 'k', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'm',
                'n', 'b', 'v', 'c', 'x', 'z', 's', 'a', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o',
                'j', 'h', 'g', 'f', 'd', 's', 'x', 'c', 'v', 'b', 'n', 'm', 'l', 'k', 'i', 'u', 'y'
        };

        countCharacters(characters2);
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

    public static void countCharacters(char[] characters) {
        boolean[] counted = new boolean[256];

        for (char current : characters) {

            if (!counted[current]) {
                int count = 0;

                for (char character : characters) {
                    if (character == current)
                        count++;
                }

                System.out.println(current + ": " + count);
                counted[current] = true;
            }
        }
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
