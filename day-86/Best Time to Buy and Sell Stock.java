class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        int profit = 0;

        for(int i=0;i<n;i++){
          if(prices[i]<buy){
            buy = prices[i];
          }

          sell = prices[i]-buy;
          if(profit<sell){
            profit = sell;
          }
        }

    return profit;    
    }
}