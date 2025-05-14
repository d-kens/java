package exception_handling.solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println(
                    "Usage: java WordCount.java fileName"
            );
            System.exit(1);
        }

        String filename = args[0];

        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(2);
        }

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        try {
           try (Scanner input = new Scanner(file)) {

               while (input.hasNext()) {
                   String line = input.nextLine();
                   charCount += line.length() + 1; // accommodate new line character
                   lineCount++;

                   String[] words = line.trim().split("\\s+"); // words ar split using regular expression
                   if (!line.trim().isEmpty()) {
                       wordCount += words.length;
                   }
               }
           }

        } catch (FileNotFoundException exception) {
           System.out.println(exception.getMessage());
        }

        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
    }
}
