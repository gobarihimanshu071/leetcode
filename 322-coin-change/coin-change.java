class Solution {

    

    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[] dp = new int[amount+1];
        int INF = 1000000000;
        for(int i=0;i<amount+1;i++){
            dp[i]=INF;
        }
        dp[0]=0;
        for(int i=n-1;i>=0;i--){
            int[] curr = new int[amount+1];
            for(int a=0;a<=amount;a++){
                int nottake = dp[a];
                int take = INF;
                if(coins[i]<=a){
                    take = 1+curr[a-coins[i]];
                }
                curr[a]=Math.min(take,nottake);
            }
            dp=curr;

        }
        return dp[amount]>=INF ? -1 : dp[amount];
        
    }
}