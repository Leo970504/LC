package LeetCode;

public class Solution121买股票的最佳时机 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            } else if(prices[i] - min > profit) {
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}
