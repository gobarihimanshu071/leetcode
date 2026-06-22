class Solution {

   
    public int findTargetSumWays(
            int[] nums,
            int target) {

        int sum = Arrays.stream(nums).sum();
        int n=nums.length;

        if((sum + target) < 0 ||
           (sum + target) % 2 != 0)
            return 0;

        int p = (sum + target) / 2;

        int[][] dp =
            new int[nums.length+1][p + 1];

        dp[0][0]=1;

        for(int i=1;i<n+1;i++){
            for(int j=0;j<p+1;j++){
                int nottake = dp[i-1][j];
                int take =0;
                if(nums[i-1]<=j){
                    take = dp[i-1][j-nums[i-1]];
                }
                dp[i][j]=take +nottake;
            }
            
        }
        return dp[n][p];
    }
}