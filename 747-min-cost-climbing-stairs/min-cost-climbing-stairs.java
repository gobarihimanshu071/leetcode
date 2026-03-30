class Solution {


    public int cal(int idx , int[] cost, int[] dp){
        if(idx==0)return cost[idx];
        if(idx==1)return cost[idx];

        if(dp[idx]!=-1)return dp[idx];
        int one = cal(idx-1,cost,dp);
        int two = cal(idx-2,cost,dp);

        return dp[idx] = cost[idx] + Math.min(one,two);
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp,-1);
        int ans = Math.min(cal(cost.length-1,cost,dp) , cal(cost.length-2,cost,dp));
        return ans;
    }
}