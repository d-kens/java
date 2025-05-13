package exception_handling;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println(
                    "Usage: java RemoveText text targetFile"
            );

            System.exit(1);
        }

        String stringToRemove = args[0];
        String filename = args[1];


        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("The target file does not exist");
            System.exit(2);
        }


        try {
            Scanner input = new Scanner(file);
            StringBuilder content = new StringBuilder();


            while (input.hasNext()) {
                String line = input.nextLine();
                System.out.println(line);
                line = line.replace(stringToRemove, "");
                content.append(line).append(System.lineSeparator());
            }
            input.close();

            PrintWriter output = new PrintWriter(file);
            output.print(content.toString());
            output.close();

        } catch (Exception exception) {
            System.out.println("An error occurred: " + exception.getMessage());
        }

    }
}
