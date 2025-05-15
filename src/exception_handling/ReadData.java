package exception_handling;

import java.io.File;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception {
        // create a file
        File file = new File("score.txt");


        try (Scanner input = new Scanner(file);) {
            while (input.hasNext()) {
                String firstName = input.next();
                String middleNameInitial = input.next();
                String lastName = input.next();
                int score = input.nextInt();

                System.out.println(
                        firstName + " " + middleNameInitial + " " + lastName + " " + score
                );
            }
        }


        // Scanning data from a string using the scanner class
        Scanner input = new Scanner("23 45");
        System.out.println("The is " + (input.nextInt() + input.nextInt()));
    }
}