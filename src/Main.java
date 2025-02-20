import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] characters = new char[]{
                'r', 'e', 't', 'y', 'u', 'i', 'o', 'p', 'i', 'u', 'y', 't', 'r', 'e', 'w', 's',
                'd', 'f', 'g', 'h', 'j', 'k', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'm',
                'n', 'b', 'v', 'c', 'x', 'z', 's', 'a', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o',
                'j', 'h', 'g', 'f', 'd', 's', 'x', 'c', 'v', 'b', 'n', 'm', 'l', 'k', 'i', 'u', 'y'
        };

        countCharacters(characters);
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


}