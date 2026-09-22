package text_and_binary_io;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromFromURL {
    static void main(String[] args) {
        System.out.println("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            URL url = new URL(URLString);

            Scanner input = new Scanner(url.openStream());

            int count = 0;

            while(input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }

            System.out.println("The file size is " + count + " characters");

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
