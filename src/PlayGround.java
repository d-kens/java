import com.sun.jdi.IntegerType;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PlayGround {
    public static void main(String[] args) {
        System.out.println("The maximum integer is " + Integer.MAX_VALUE);
        System.out.println("The minimum integer is " + Integer.MIN_VALUE);

        System.out.println("The maximum float is " + Float.MAX_VALUE);
        System.out.println("The minimum float is " + Float.MIN_VALUE);

        System.out.println(Double.valueOf(45));
        System.out.println(Double.valueOf(45).intValue());

        System.out.println(Double.valueOf(12.4).compareTo(Double.valueOf(12.3)));
        System.out.println(Double.valueOf(12.4).compareTo(Double.valueOf(12.4)));
        System.out.println(Double.valueOf(12.2).compareTo(Double.valueOf(12.3)));


        Integer integerObject = 2; // autoboxing
        int i = Integer.valueOf(1); // autounboxing


        Integer[] values = {1, 2, 3}; // autoboxing - primitive values 1, 2, and 3 are automatically boxed into objets
        System.out.println(values[0] + values[1] + values[2]); //autounboxing - the objects are automatically unboxed into int values


        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("2");
        BigInteger c = b.multiply(a);
        System.out.println(c);

        System.out.println(factorial(50));

        String string1 = new String("Creating a string object from a string literal");
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String greeting = new String(charArray);

        String s = "HTML";
        s = "JAVA";
        System.out.println(s);

        // Interned String

        String s1 = "Welcome to Java";
        String s2 = new String("Welcome to Java");
        String s3 = "Welcome to Java";
        String s4 = new String("Welcome to Java");



        System.out.println("s1 == s2 is " + (s1 == s2)); // false
        System.out.println("s1 == s3 is " + (s1 == s3)); // true
        System.out.println("s2 == s4 is " + (s2 == s4)); // false

        // Replacing and Splitting Strings
        System.out.println("Welcome".replace('e', 'E'));
        System.out.println("Welcome".replaceFirst("e", "E"));
        System.out.println("Welcome".replaceAll("e", "AL"));

        String s5 = "I need to believe in something hard enough and see how it goes";
        String[] tokens = s5.split(" ");

        for (int k = 0; k < tokens.length; k++)
            System.out.println(tokens[k]);


        // Conversion between Strings and Arrays
        char[] characterArray = "Dickens".toCharArray();
        for (char character : characterArray)
            System.out.print(character + ", ");

        char[] destination = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        "CS3720".getChars(2, 6, destination, 4);

        System.out.println();
        for (char character : destination)
            System.out.print(character + " ");

        System.out.println();
        System.out.println(String.valueOf(new char[]{'J', 'a', 'n', 'e'}));

        System.out.println(String.valueOf(5.40));
    }

    // A factorial of an integer can be very large
    // Method that returns a factorial for any integer
    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
