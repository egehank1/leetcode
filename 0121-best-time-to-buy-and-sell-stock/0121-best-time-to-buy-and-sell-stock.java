class Solution {
    public int maxProfit(int[] prices) {
        // technically the min value is not important, all we have to do is to check profit all the time
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            else if(prices[i] - min > profit){
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}