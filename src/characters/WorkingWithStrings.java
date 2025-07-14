package characters;

import java.util.Scanner;

public class WorkingWithStrings {
    public static void main(String[] args) {
        String message = "   My name is Onyango Dickens.    ";
        System.out.println(message.length());

        System.out.println(message.charAt(16));

        System.out.println(message.concat(" I am happy to be here"));

        System.out.println(message + " Amor!!");

        System.out.println("Welcome" + " to" + " java");
        System.out.println("Hello number " + 2);
        System.out.println("This is letter " + 'B');
        int i = 1;
        int j = 2;
        System.out.println(" i + j is " + i + j);
        System.out.println(" i + j is " + (i + j));

        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        System.out.println(message.toLowerCase());


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character:");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);


        System.out.println("Enter a line: ");
        String line = input.nextLine();
        System.out.println(line);


        System.out.println("Enter three words separate by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);



        String s10 = "ababa";
        String s11 = "ababb";

        System.out.println(s10.compareTo(s11));



        // Obtaining Substrings
        String sampleString = "Welcome to java";
        System.out.println(sampleString.substring(1));
        System.out.println(sampleString.substring(15,15));


        String fullName = "Onyango  Dickens";
        int k = fullName.indexOf(' ');
        String firstName = fullName.substring(0, k);
        String lastName = fullName.substring(k + 1);
        System.out.println(firstName);
        System.out.println(lastName);
    }
}
