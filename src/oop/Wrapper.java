package oop;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Wrapper {
    public static void main(String[] args) {
        var doubleObject = Double.valueOf("90");
        var integerObject = Integer.valueOf("80");

        System.out.println(doubleObject);
        System.out.println(integerObject);

        System.out.println(doubleObject.intValue());
        System.out.println(integerObject.doubleValue());

        System.out.println(Integer.parseInt("70"));
        System.out.println(Double.parseDouble("90.00"));

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int number = 1000;
        String str1 = String.valueOf(number);
        String str2 = Integer.toString(number);

        int value = Integer.parseInt(str1);

        //autoboxing
        Integer ntObject = 3;


        Integer[] intArray = {1, 2, 4}; // autoboxing
        System.out.println(intArray[0] + intArray[1] + intArray[2]); // autounboxing


        BigInteger bigInteger = new BigInteger("12345678901234567890");
        System.out.println(bigInteger);

        double price = 19.99;
        double quantity = 3;
        System.out.println(price * quantity);

        BigDecimal price1 = new BigDecimal("19.99");
        BigDecimal quantity1 = new BigDecimal("3");
        BigDecimal total = price1.multiply(quantity1);
        System.out.println(total);


        System.out.println("50! is \n" + factorial(50));




        // The String Class
        String message = "Welcome to Java";

        String name = new String(new char[]{ 'D', 'i', 'c', 'k', 'e', 'n', 's' });

        String s = "Omondi Dickens";
        s = "HTML";

        String s1 = "Welcome to Java";

        System.out.println("s1 == s is " + (s1 == s));
        System.out.println("s1 == message is " + (s1 == message));


        String[] tokens = "I#loved#my#mother".split("#");
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");


        // equals on;ly matches a fixed string
        // matches can not only match a fixed string but alos a set of strings that follow a pattern
        System.out.println("");
        System.out.println("Java".matches("Java"));
        System.out.println("Java".equals("Java"));

        System.out.println("Java is fun".matches("Java.*"));


        System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{3}"));

        String string = "a+b$#c".replaceFirst("[$+#]", "WUZU");
        System.out.println(string);

        String[] stringTokens = "Java,C?c#,C++".split("[.,:;?]");

        for (int i =0; i < stringTokens.length; i++) System.out.println(stringTokens[i]);


        char[] characters = "Onyango Dickens Omondi".toCharArray();

        for (int i = 0; i < characters.length; i++) System.out.print(characters[i] + " ");

        System.out.println();

        char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        "CS3720".getChars(2, 6, dst, 4);
        for (int i = 0; i < dst.length; i++) System.out.print(dst[i] + " ");

        System.out.println(new String(new char[]{'D', 'i', 'c', 'k', 'e', 'n', 's'}));
        System.out.println(String.valueOf(new char[]{'Y', 'o', 'y', 'o'}));



        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        stringBuilder.append(" ");
        stringBuilder.append("to");
        stringBuilder.append(" ");
        stringBuilder.append("Java");
        stringBuilder.insert(15, " and HTML");

        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(15);

        System.out.println(stringBuilder);

        stringBuilder.delete(8, 23);
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.replace(0, 8, "Onyi Papa J");
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(0, 'E');
        System.out.println(stringBuilder);


        System.out.println(stringBuilder.capacity());
        stringBuilder.setLength(200);
        System.out.println(stringBuilder.capacity());
        stringBuilder.trimToSize();
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder);

    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            result  = result.multiply(new BigInteger(i + ""));
        }

        return result;
    }
}
