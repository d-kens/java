
/**
 - Array of prices: [7, 1, 5, 3, 6, 4]
 - Where each element prices[i] represent the stock price on day i
 - We need to buy once and sell once in the future and maximize profit
 - Constraints
 * Must buy before selling (Buy today and sell at a later day)
 * If no profit is possible, return 0
 - profit = sellingPrice - buyingPrice
 */

import java.util.Random;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = new int[10000000];
        Random rand = new Random();

        // Initialize array with random prices between 1 and 100
        for (int i = 0; i < prices.length; i++) {
            prices[i] = rand.nextInt(10000) + 1;
        }

        // Measure efficient method
        long startEfficient = System.nanoTime();
        int maxProfitEfficient = maxProfit(prices);
        long endEfficient = System.nanoTime();

        // Measure brute force method
        long startBrute = System.nanoTime();
        int maxProfitBrute = maxProfitBruteForce(prices);
        long endBrute = System.nanoTime();

        // Print results
        System.out.println("Efficient Method (O(n)):");
        System.out.println("  Max profit = " + maxProfitEfficient);
        System.out.println("  Time taken = " + (endEfficient - startEfficient) / 1_000_000.0 + " ms\n");

        System.out.println("Brute Force Method (O(n^2)):");
        System.out.println("  Max profit = " + maxProfitBrute);
        System.out.println("  Time taken = " + (endBrute - startBrute) / 1_000_000.0 + " ms");
    }

    // Efficient O(n) method
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit)
                    maxProfit = profit;
            }
        }
        return maxProfit;
    }

    // Brute Force O(n^2) method
    public static int maxProfitBruteForce(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit)
                    maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
