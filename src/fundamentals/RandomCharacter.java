package fundamentals;

public class RandomCharacter {
    public static void main(String [] args) {
        printRandomCharacters(175, 25);
    }


    // Get a random character between ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    // Get a random lowercase character
    public static char gerRandomLowerCaseCharacter() {
        return getRandomCharacter('a', 'z');
    }

    // Get a random uppercase character
    public static char gerRandomUpperCaseCharacter() {
        return getRandomCharacter('A', 'Z');
    }

    // Get a random digit character
    public static char gerRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    // Get a random character
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }

    // Print random characters
    public static void printRandomCharacters(int totalNumberOfCharacter, int numberOfCharactersPerLine) {
        for (int i = 0; i < totalNumberOfCharacter; i++) {
            char randomChar = gerRandomLowerCaseCharacter();

            if((i + 1) % numberOfCharactersPerLine == 0) {
                System.out.println(randomChar);
            } else {
                System.out.print(randomChar);
            }
        }
    }


}
