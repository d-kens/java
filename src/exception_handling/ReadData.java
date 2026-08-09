package exception_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws IOException {
        // create a file instance
        File file = new File("src/exception_handling/score2.txt");

        // create a scanner for the file
        Scanner input = new Scanner(file);

        // read data for the file
        while (input.hasNext()) {
            String firstName = input.next();
            String middleName = input.next();
            String lastName = input.next();
            int score = input.nextInt();

            System.out.println(firstName + " " + middleName + " " + lastName + " " + score);
        }

        // it is not necessary to close the input file,
        // but it is good practice to do so to release resource occupied by the file
        input.close();
    }
}
