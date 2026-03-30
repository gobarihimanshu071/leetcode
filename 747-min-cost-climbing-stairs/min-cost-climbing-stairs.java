class Solution {


    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int prev=cost[1];
        int prev2=cost[0];
        for(int i=2;i<n;i++){
            int cur = Math.min(prev+cost[i], prev2+cost[i]);
            prev2=prev;
            prev=cur;
        }
        return Math.min(prev2,prev);
    }
}