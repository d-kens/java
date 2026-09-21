package text_and_binary_io;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Replaces all occurrences of string in text file with a new string
 * java ReplaceText sourceFile targetFile oldString newString
 * java ReplaceText FormatString.java t.txt StringBuilder StringBuffer
 *
 * How to run (from the project root, /Users/Dickens/Documents/wuzu/java):
 *
 * 1. Compile:
 *    javac -d out src/text_and_binary_io/ReplaceText.java
 *    - javac: the Java compiler.
 *    - -d out: put the compiled .class file(s) under the "out" directory,
 *      mirroring the package structure (out/text_and_binary_io/ReplaceText.class).
 *    - src/text_and_binary_io/ReplaceText.java: the source file to compile.
 *
 * 2. Run:
 *    java -cp out text_and_binary_io.ReplaceText src/text_and_binary_io/source.txt src/text_and_binary_io/target.txt hello YELLOW
 *    - java: the JVM launcher.
 *    - -cp out: classpath - tells the JVM where to look for compiled classes (the "out" folder).
 *    - text_and_binary_io.ReplaceText: the fully qualified class to run (package.ClassName).
 *    - The remaining four values are the program's own command-line args (args[0..3]):
 *      sourceFile, targetFile, oldString, newString.
 *
 * File paths are resolved relative to the current working directory (where the
 * "java" command is invoked), not relative to the .java/.class file's location -
 * that's why the commands above must be run from the project root.
 */

public class ReplaceText {
    static void main(String[] args) throws IOException {
        // Check command line parameter usage
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldString newString");
            System.exit(1);
        }

        // Check if the source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
        }

        // Check if the targetFile exists
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("target file " + args[1] + "already exist");
        }


        try (
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);
                ) {

            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                output.println(s2);
            }
        }
    }
}
