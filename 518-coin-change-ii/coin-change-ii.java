class Solution {


    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[] count = new int[1];
        int[][] dp = new int[n+1][amount+1];
        dp[n][0]=1;

        for(int i=n-1;i>=0;i--){
            for(int a=0;a<=amount;a++){
                int nottake = dp[i+1][a];
                int take =0;
                if(coins[i]<=a){
                    take = dp[i][a-coins[i]];
                }
                dp[i][a]=take+nottake;
            }
        }
        return dp[0][amount];
    }
}