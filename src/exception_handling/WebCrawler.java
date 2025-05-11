
/*
    The program starts with a user provided URL, crawls the web by following hyperlinks found on the web pages, and prints each unique url it visits.
    It avoids revisiting the same url and limits the total number of url traversed to 100.

    Key Components:
     - Main Method: Takes the user input (starting URL) and initiates the crawling process.
     - Crawler method: Implements the core crawling logic using two lists one for pending urls to visit and another for URLs already traversed.
     - getSubURLs Method: Extracts all URLs (hyperlinks) from a given web page


     1. Crawl Method
      - Key variables: listOfPendingURLs and listOfTraversedURLs storing URLs that need to be visited and keeps track of URLs that have already been visited.
      - How it works:
       * Add the stating url to listOfPendingURLs
       * Loop condition: Continue crawling while listOfPendingURLs is not empty and the number of traversed urls is ≤ 100.
       * Remove the fist URL from listOfPendingURLs
       * If the URl is not in listOfTraversedURLs
          - Add to the list
          - Print the URl
          - call getSubURLs to extract all hyperlinks form the page
          - for each extracted URL if it is not in listOfTraversedURLs, add it to listOfPendingURLs
       * Continue the loop until either listOfPendingURLs is empty or 100 URLs have been traversed.

     2. getSubURLs Method
     - How it works:
       * Create a URL object from the input string
       * Open a connection to the URL and read its content using Scanner via openStream.
       * Read the web page content line by line
       * Search for URLs
         - For each line, search for the substring "http:" starting from the current index.
         - If found, locate the end of the URL by finding the next double quote (") after http:.
         - Extract the URL using line.substring(current, endIndex).
         - Update current to search for the next http: in the same line, starting after the end of the previous URL.
         - If no closing quote is found (endIndex <= 0), set current = -1 to exit the inner loop.
       * Error Handling: If an exception occurs (e.g., invalid URL, network error), catch it, print the error message, and continue.
       * Return: Return the list of extracted URLs

*/

package exception_handling;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;


public class WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a URL: ");

        String url = input.nextLine();
        crawler(url);
    }


    public static void crawler(String startingUrl) {
        ArrayList<String> listOfPendingUrls = new ArrayList<>();
        ArrayList<String> listOfTraversedUrls = new ArrayList<>();

        listOfPendingUrls.add(startingUrl);

        while(!listOfPendingUrls.isEmpty() && listOfTraversedUrls.size() <= 100) {
            String urlString = listOfPendingUrls.remove(0);

            if(!listOfTraversedUrls.contains(urlString)) {
                listOfTraversedUrls.add(urlString);

                System.out.println("Crawl " + urlString);

                for (String s: getSubURLs(urlString)) {
                    if(!listOfTraversedUrls.contains(s))
                        listOfPendingUrls.add(s);
                }
            }
        }
    }

    // Extract all the URLs with https from the HTML content of a given web page (URL)
    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {

            URL url =  new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;

            while(input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("https:", current);

                if(current > 0) {
                    int endIndex = line.indexOf("\"", current);

                    if(endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("https:", endIndex);
                    } else
                        current = -1;
                }
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return list;
    }
}
