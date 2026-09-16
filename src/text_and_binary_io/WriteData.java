package text_and_binary_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/text_and_binary_io/scores.txt");

        if (file.exists()) {
            System.out.println("The file already exists");
            System.exit(1);
        }

        // Create the file
        PrintWriter output = new PrintWriter(file);

        // Write a formated output to the file
        output.print("Onyango D Omondi ");
        output.println(90);

        output.print("John T Smith ");
        output.println(85);

        // Close the file
        output.close();

    }
}
