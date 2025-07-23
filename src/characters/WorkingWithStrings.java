package characters;

import java.util.Scanner;

public class WorkingWithStrings {
    public static void main(String[] args) {
        /* Simple String Methods */
        String message = "Welcome to Java";

        System.out.println(message.length());
        System.out.println("Hello".length());

        System.out.println(message.charAt(3));

        System.out.println(message.concat(". It is a fun language to learn!"));
        System.out.println(message + "! You will enjoy it.");
        System.out.println("Chapter " + 2);
        System.out.println("Supplement " + 'B');
        int i = 2, j = 3;
        System.out.println("i + j is " + i + j);
        System.out.println("i + j is " + (i + j));

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println("     Wewe ni wetu".trim());

        /* Reading a String from the Console */
        Scanner input = new Scanner(System.in);

//        System.out.println("Describe yourself in 3 words: ");
//        String description = input.nextLine();
//        System.out.println(description);
//
//        System.out.println("Enter three words separated by spaces: ");
//        String s1 = input.next();
//        String s2 = input.next();
//        String s3 = input.next();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);


        /* Comparing Strings */
        String s4 = "Welcome to Java";
        String s5 = "Welcome to Java";
        String s6 = "Welcome to c++";

        System.out.println(s4.equals(s5));
        System.out.println(s4.equals(s6));

        System.out.println(s4.compareTo(s5));
        System.out.println(s4.compareTo(s6));

        /* Obtaining Substring */
        System.out.println(s4.substring(4));
        System.out.println(s4.substring(4, 6));

        /* Finding a character or a substring in a string */
        System.out.println(s4.indexOf("a"));
        System.out.println(s4.lastIndexOf('a'));
        System.out.println(s4.indexOf('a', 14));
        System.out.println(s4.lastIndexOf('a', 10));
    }
}
