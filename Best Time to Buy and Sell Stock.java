class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Correctly using minPrice
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Fixed typo: minPrices -> minPrice, Prices -> prices
            } else {
                int profit = prices[i] - minPrice; // Fixed typo: Prices -> prices
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit; // Return the maximum profit
    }
}
