package exception_handling.solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 To replace a string in a file
 with a new string for all files in the specified directory using the command:
 java Exercise12_22 dir oldString newString
 */

public class ReplaceText {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println(
                    "Usage: java ReplaceText.java dir oldString newString"
            );
            System.exit(1);
        }

        String directoryName = args[0];
        String oldString = args[1];
        String newString = args[2];

        File file = new File(directoryName);

        if (!file.exists()) {
            System.out.println("The file specified does not exist");
            System.exit(2);
        }

        if(!file.isDirectory()) {
            System.out.println("The file specified is not a directory");
            System.exit(2);
        }

        File[] dirFiles = file.listFiles();

        try {

            for (File dirFile : dirFiles) {

                StringBuilder output = new StringBuilder();

                try (Scanner input = new Scanner(dirFile)) {
                    while (input.hasNext()) {
                        String line = input.nextLine();
                        output.append(line.replace(oldString, newString)).append(System.lineSeparator());
                    }
                }

                try (PrintWriter writer = new PrintWriter(dirFile)) {
                    writer.print(output.toString());
                }

            }

        } catch (FileNotFoundException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

    }
}
