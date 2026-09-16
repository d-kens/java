package text_and_binary_io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws IOException {
        File file = new File("src/text_and_binary_io/scores2.txt");

        if (file.exists()) {
            System.out.println("The file already exists");
            System.exit(1);
        }

        try (
                // Create a file
                PrintWriter output = new PrintWriter(file);
                ) {
            // Write a formated output to the file
            output.print("Tivian M Trivian ");
            output.println(90);

            output.print("John T Smith ");
            output.println(85);
        }
    }

}
