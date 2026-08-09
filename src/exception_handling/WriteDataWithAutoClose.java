package exception_handling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws IOException {
        File file = new File("src/exception_handling/score2.txt");

        if (file.exists()) {
            System.out.println("File already exist");
            System.exit(0);
        }


       try (
               PrintWriter output = new PrintWriter(file);
               ) {
           output.print("Tomacti M Jun ");
           output.println(88);
           output.print("Baba B Vos ");
           output.println(94);
       }



    }
}
