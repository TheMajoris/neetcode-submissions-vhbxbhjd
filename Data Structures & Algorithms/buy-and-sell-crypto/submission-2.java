class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int lowest = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lowest){
                lowest = prices[i];
                max = Integer.max(max, prices[i] - lowest);
            }
            max = Integer.max(max, prices[i] - lowest);
        }

        return max;
    }
}
