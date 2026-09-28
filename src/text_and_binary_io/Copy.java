package text_and_binary_io;

import java.io.*;

public class Copy {
    /**
     * @param args[0] for the source file
     * @parqm args[1] for the target file
     *
     * Usage: java text_and_binary_io/Copy.java text_and_binary_io/source.txt text_and_binary_io/copy_of_source.txt
     */
    static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java Copy sourceFile targetfile");
            System.exit(0);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(1);
        }

        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
        }

        try (
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(sourceFile));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(targetFile))
                ) {

            int r, numberOfBytesCopied = 0;

            while ((r = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write((byte)r);
                numberOfBytesCopied++;
            }

            System.out.println(numberOfBytesCopied + " bytes copied");

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
