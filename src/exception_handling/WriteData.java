package exception_handling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("score.txt");

        if(file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        // try with resouces syntax
        try ( PrintWriter output = new PrintWriter(file);) {
            output.print("Onyango O Dickens ");
            output.println(90);
            output.print("Eric k James ");
            output.println (85);
        }
    }
}
