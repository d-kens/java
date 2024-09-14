import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // primitive types
        byte age = 30;
        long viewCount = 3_123_456_789L;
        float price = 10.99f;
        char letter = 'A';
        boolean isEligible = true;


        // strings
        String message = new String(" Hello world");
        String message2 = "My name is Charles Njonjo";
        String combinedMessage = message + ". " +  message2; // string concatenation

        System.out.println(message);
        System.out.println(message2);
        System.out.println(combinedMessage);

        System.out.println(combinedMessage.endsWith("o"));
        System.out.println(combinedMessage.length());

        // strings are immutable. String operations (concatenation, slicing) do not modify the original strings but create and return new objects
        System.out.println(combinedMessage.replace("Njonjo", "Dickens"));
        System.out.println(message.trim());

        // Escape sequence
        System.out.println("Onyango\nDickens");
        System.out.println("Onyango\tDickens");
        System.out.println("\'Onyango\' Dickens");
        System.out.println("Dickens \"Onyango\"");
        System.out.println("\\Dickens \\Onyango");


        // Arrays
        int [] numbers = new int[8];
        numbers[0] = 10;
        numbers[1] = 11;
        numbers[2] = 23;
        System.out.println(numbers[2]);
        System.out.println(Arrays.toString(numbers));

        String [] names = { "Onyango", "Dickens", "Omondi" };
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        // Multi dimensional arrays
        int [][] values1 = new int[2][3];
        values1[0][0] = 4;
        values1[1][1] = 16;
        System.out.println(Arrays.deepToString(values1));

        int [][] values2 = { {2, 4, 8}, { 4, 8, 16 }, { 8, 16, 32}, { 16, 32, 64 } };
        System.out.println(Arrays.deepToString(values2));


    }
}