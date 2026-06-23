class Solution {

    public static int f(int idx,int coins[],int amount,int dp[][]){
        if(idx<0 || amount<0)return 0;
        if(amount==0){
            return 1;
        }
        if(dp[idx][amount]!=-1)return dp[idx][amount];
        int nottake = f(idx-1,coins,amount,dp);
        int take = 0;
        if(coins[idx]<=amount)
        take = f(idx,coins,amount-coins[idx],dp);
        return dp[idx][amount] = nottake + take;
    }

    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[] count = new int[1];
        int[][] dp = new int[n][amount+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        int ans = f(n-1,coins,amount,dp);
        return ans;
    }
}