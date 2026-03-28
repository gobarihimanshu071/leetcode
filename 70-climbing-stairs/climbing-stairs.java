class Solution {

    public int count(int n,int[] dp){
        if(n==0 || n==1)return 1;
        if(dp[n]!=0)return dp[n];
        int l=count(n-1,dp);
        int r=count(n-2,dp);
        return dp[n]=l+r;
    }


    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        int ans = count(n,dp);
        return ans;
    }
}