class Solution {


    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[] count = new int[1];
        int[] dp = new int[amount+1];
        dp[0]=1;

        for(int i=n-1;i>=0;i--){
            int[] curr=new int[amount+1];
            for(int a=0;a<=amount;a++){
                int nottake = dp[a];
                int take =0;
                if(coins[i]<=a){
                    take = curr[a-coins[i]];
                }
                curr[a]=take+nottake;
            }
            dp=curr;
        }
        return dp[amount];
    }
}