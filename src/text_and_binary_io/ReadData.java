package text_and_binary_io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    static void main(String[] args) throws IOException {
        // Create a file instance
        File file = new File("src/text_and_binary_io/scores.txt");

        // Create a scanner for file
        Scanner input = new Scanner(file);

        // Read data for the file
        while(input.hasNext()) {
            String firstName = input.next();
            String middleName = input.next();
            String lastName = input.next();
            int score = input.nextInt();

            System.out.println(firstName + " " + middleName + " " + lastName + " " +score);
        }

        // Close the file
        input.close();
    }
}
