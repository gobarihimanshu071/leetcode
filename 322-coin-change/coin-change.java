class Solution {

    

    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp = new int[n+1][amount+1];
        int INF = 1000000000;
        for(int i=0;i<amount+1;i++){
            dp[n][i]=INF;
        }
        dp[n][0]=0;
        for(int i=n-1;i>=0;i--){
            for(int a=0;a<=amount;a++){
                int nottake = dp[i+1][a];
                int take = INF;
                if(coins[i]<=a){
                    take = 1+dp[i][a-coins[i]];
                }
                dp[i][a]=Math.min(take,nottake);
            }

        }
        return dp[0][amount]>=INF ? -1 : dp[0][amount];
        
    }
}