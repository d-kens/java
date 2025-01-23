
public class Main {
    public static void main(String[] args) {
        char letter = 'A';
        char numChar = '4';

        // Casting an integer to char
        char character = (char)70;
        System.out.println(character);

        // Floating point to char
        char character2 = (char)65.75;
        System.out.println(character2);

        // Character to numeric type - The character's  Unicode is cats into th specified type
        int number = (int)'A';
        System.out.println(number);

        // Within the range (0 to FFFF)
        int hex1 = 0x0041; // 65 in decimal
        char char1 = (char) hex1; // Implicit casting allowed
        System.out.println("Hex: " + Integer.toHexString(hex1) + " -> Char: " + char1); // Output: A

        int hex2 = 0x03B1; // 945 in decimal (Greek letter alpha)
        char char2 = (char) hex2; // Implicit casting allowed
        System.out.println("Hex: " + Integer.toHexString(hex2) + " -> Char: " + char2); // Output: α

        // Outside the range (> FFFF)
        int hex3 = 0x10400; // 66560 in decimal
        char char3 = (char)hex3; // Explicit casting required
        System.out.println("Hex: " + Integer.toHexString(hex3) + " -> Char: " + char3); // Output: (wraps around)

        // Negative value
        int hex4 = -1; // -1 in decimal
        char char4 = (char) hex4; // Explicit casting required
        System.out.println("Decimal: " + hex4 + " -> Char: " + char4); // Output: wraps around to a character


        System.out.println((int)'2');

        System.out.println("Chapter " + '2');

        int j = 2 + 'a';

        System.out.println(j + " is the Unicode for character " + (char)j);


    }
}