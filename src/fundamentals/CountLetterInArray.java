package fundamentals;

public class CountLetterInArray {

    public static void main(String[] args) {
        char[] characters = createArray();

        displayArray(characters);
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

    public static char getRandomCharacter(char character1, char character2) {
        return (char) (character1 + Math.random() * (character2 - character1 + 1));
    }

    public static char getRandomLowerCaseCharacter() {
        return getRandomCharacter('a', 'z');
    }

}
