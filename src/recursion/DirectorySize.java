package recursion;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {

    static void main(String[] args) {
        System.out.println("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);

        String directory = input.nextLine();

        System.out.println(getSize(new File(directory)) + " bytes");
    }


    /**
     * size(d) = size(f1) + size(f2) + ..... + size(fm) + size(d1) + size(d2) + ...... + size(dn)
     */

    public static long getSize(File file) {
        long size = 0;

        if (file.isDirectory()) {
            File[] files = file.listFiles(); // All files and subdirectories

            for (int i = 0; file != null && i < files.length; i++) {
                size += getSize(files[i]); // recursive call
            }

        } else { // base case
            size += file.length();
        }

        return size;
    }
}
