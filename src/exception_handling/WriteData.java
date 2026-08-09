package exception_handling;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("src/exception_handling/score.txt");

        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        // Create file
        PrintWriter output = new PrintWriter(file);

        // Write a formatted output to the file
        output.print("Onyango O Dickens: ");
        output.println(90);

        output.print("Warutere M Njoki: ");
        output.println(88);

        // if the close method is not invoked, data may not bbe saved properly
        output.close();
    }
}
