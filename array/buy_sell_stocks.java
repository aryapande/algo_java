//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
        int buy = Integer.MAX_VALUE;
        
        for(int x = 0 ; x<prices.length; x++)
        {
            if(prices[x]<buy)
            {
                buy = prices[x];
            }
            else if(prices[x]- buy>sell)
            {
                sell = prices[x] - buy;
            }
            
            
        }
        return sell;
    }
}
