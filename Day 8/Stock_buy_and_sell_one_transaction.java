class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        if(prices == null || prices.length == 1) return 0;
        
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for(int i = 0 ; i < prices.length ; i++){
            
            if(prices[i] < minPrice) minPrice = prices[i];
            
            int profit = prices[i] - minPrice;
            
            if(profit > maxProfit) maxProfit = profit;
        }
        
        return maxProfit;
        
    }
}