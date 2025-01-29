// LeetCode 122 Best Time to Buy and Sell Stock II : Greedy, Array
class Solution {
    public int maxProfit(int[] prices) {
        
        int i = 0; // buying price idx
        
        int profit = 0;
        for(int j = 1; j < prices.length; j++) {
            if(prices[j - 1] > prices[j]) {
                profit += prices[j-1] - prices[i];
                i = j;
            }
            if(j == prices.length - 1 && prices[j] >= prices[j-1]) {
                profit += prices[j] - prices[i];
            }
        }
        
        return profit;
        
    }

    public int maxProfit02(int[] prices) {
        // Greedy
        
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }

        return maxProfit;
    }
}
