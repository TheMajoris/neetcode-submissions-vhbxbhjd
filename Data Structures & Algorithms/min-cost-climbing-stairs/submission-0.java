/*
For every n step, there are two choices
1. Go to n step from the n-1 step
    steps = (min cost of n-1) + cost[n-1]; (adding on the cost to get from n-1 to n)
2. Go to n step from the n-2 step
    steps = (min cost of n-2) + cost[n-2]; (adding on the cost to get from n-2 to n)

Base cases:
1. steps 0, 1 == 0 cost

*/
class Solution {
    private int[] dp;
    private int[] cost;

    public int recurse(int i){
        if(i == 0 || i == 1){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int best = Integer.MAX_VALUE;
        
        best = Math.min(recurse(i-1) + cost[i-1], recurse(i-2) + cost[i-2]);

        dp[i] = best;

        return best;
    }

    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length + 2];
        Arrays.fill(dp, -1);
        this.cost = cost;

        return recurse(cost.length);
    }
}