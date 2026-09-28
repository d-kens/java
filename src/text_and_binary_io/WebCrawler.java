package text_and_binary_io;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Web (WWW) - A system of interlinked hypertext documents on the internet.
 * A program that automatically traverses the documents of a web by following hyperlinks.
 *
 * Algorithm for the program:
 *
 * Add the starting URL to a list named listOfPendingURLs;
 * while (listOfPendingURLs is not empty
 *        and size of listOfTraversedURLs <= 100) {
 *     Remove a URL from listOfPendingURLs;
 *     if (this URL is not in listOfTraversedURLs) {
 *         Add it to listOfTraversedURLs;
 *         Display this URL;
 *         Read the page from this URL and for each URL contained in the page {
 *             Add it to listOfPendingURLs if it is not in listOfTraversedURLs;
 *         }
 *     }
 * }
 */

public class WebCrawler {

    static void main(String[] args) {

        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        System.out.println("Enter a starting URL: ");
        String startingURLString = new Scanner(System.in).next();
        System.out.println("The entered starting URL is: " + startingURLString);

        listOfPendingURLs.add(startingURLString);

        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() < 100) {

            String urlString = listOfPendingURLs.remove(0);

            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);

                System.out.println("Crawled: " + urlString);

                try (Scanner input = new Scanner(new URL(urlString).openStream())) {

                    while (input.hasNextLine()) {

                        // <a href="/about">About</a><a href="https://b.com">B</a>

                        String line = input.nextLine();

                        int start = line.indexOf("href=\""); // start of href="
                        while (start >= 0) {
                            int linkStart = start + 6; // skip the 6 characters of href="
                            int end = line.indexOf("\"", linkStart); // closing quote
                            if (end < 0)  break; // no closing quote, stop checking this line

                            String link = line.substring(linkStart, end); // e.g. /about or https://b.com

                            if (!link.startsWith("#")) { // #top only jumps within the same page
                                try {
                                    // turn relative links into full URLs, based on the current page
                                    String url = URI.create(urlString).resolve(link).toString();

                                    if (url.startsWith("http") && !listOfTraversedURLs.contains(url)) {
                                        listOfPendingURLs.add(url);
                                    }
                                } catch (IllegalArgumentException e) {
                                    // badly formed link (e.g. contains spaces), skip it
                                    System.out.println("Skipped invalid link: " + link);
                                }
                            }

                            start = line.indexOf("href=\"", end); // look for the next link on the same line
                        }
                    }

                } catch (MalformedURLException e) {
                    System.out.println("Invalid URL: " + urlString);
                } catch (IOException e) {
                    System.out.println("Could not read: " + urlString);
                }
            }
        }
    }
}
