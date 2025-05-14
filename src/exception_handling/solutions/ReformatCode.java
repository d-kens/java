package exception_handling.solutions;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReformatCode {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ReformatCode Test.java");
            System.exit(1);
        }

        String filename = args[0];

        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File specified does not exist");
            System.exit(2);
        }


        try {
            ArrayList<String> lines = new ArrayList<>();



            try ( Scanner input = new Scanner(file);) {
                while (input.hasNext()) {
                    lines.add(input.nextLine());
                }
            }

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < lines.size(); i++) {
                String currentLine = lines.get(i).trim();
                String nextLine = ((i + 1) < lines.size()) ? lines.get(i + 1).trim() : "";


                if (!currentLine.isEmpty() && nextLine.equals("{")) {
                    result.append(lines.get(i)).append(" {");
                    i++;
                } else {
                    result.append(lines.get(i));
                }

                if (i < lines.size() - 1) {
                    result.append(System.lineSeparator());
                }
            }

            try (PrintWriter writer = new PrintWriter(file)) {
                writer.print(result.toString());
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
