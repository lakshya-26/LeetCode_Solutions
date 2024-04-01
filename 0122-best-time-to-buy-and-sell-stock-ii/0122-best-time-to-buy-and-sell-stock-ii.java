class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                ans += prices[i - 1] - buyPrice;
                buyPrice = prices[i];
            }
        }
        return ans + prices[prices.length - 1] - buyPrice;
    }
}