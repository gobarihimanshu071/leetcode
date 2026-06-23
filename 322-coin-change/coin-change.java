class Solution {

    public static int f(int idx, int coins[], int amount,int dp[][]){
        if(amount==0){
            return 0;
        }
        if(idx==coins.length || amount<0)return 1000000000;
        
        if(dp[idx][amount]!=-1)return dp[idx][amount];
        

        int nottake = f(idx+1,coins,amount,dp);
        int take = 1000000000;
        if(coins[idx]<=amount)
        take =1+f(idx,coins,amount-coins[idx],dp);
        return dp[idx][amount] = Math.min(take,nottake);

    }

    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp = new int[n][amount+1];
        for(int row[] : dp){
            Arrays.fill(row,-1);
        }
        int ans =
            f(0, coins, amount, dp);

        return ans >= 1000000000
               ? -1
               : ans;
    }
}