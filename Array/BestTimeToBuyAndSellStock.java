class BestTimeToBuyAndSellStock {
    // Kadane's Algo
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i-1];
            currProfit = Math.max(0, currProfit + diff);  // extend or reset
            maxProfit = Math.max(maxProfit, currProfit);
        }
        
        return maxProfit;
    }
}
