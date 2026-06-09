class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int left = 0;
        
        int max = 0;


        for(int right = 1; right < prices.length; right++){
            if(prices[right] > prices[left]){
                int profit = prices[right] - prices[left];
                max = Math.max(profit, max);
            }else{
                left = right;
            }

        }

        return max;
    }
}
