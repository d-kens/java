package text_and_binary_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    static void main(String[] args) throws IOException {
        try (
                // create an output stream to the file
                FileOutputStream output = new FileOutputStream("temp.dat");
                ) {
            // out put values to the file
            for (int i = 1; i <= 10; i++) {
                output.write(i);
            }
        }

        try (
                // Create an input stream for the file
                FileInputStream input = new FileInputStream("temp.dat");
                ) {
            // Read values from the file
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
        }



    }
}
