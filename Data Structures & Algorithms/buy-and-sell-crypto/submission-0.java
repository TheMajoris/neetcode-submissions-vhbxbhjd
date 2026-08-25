class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int best = 0;
        for(int i = 1; i < prices.length-1; i++){
            int diff = prices[i] - prices[i-1];
            if(max < diff){
                max = Integer.max(max, diff);
                best = prices[i];
            }

        }

        return best;
    }
}
