class Solution {
    

    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum%2!=0)return false;
        int n=nums.length;
        if(sum%2!=0)return false;
        int target=sum/2;
        boolean[][] dp = new boolean[n+1][target+1];

        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                boolean nottake = dp[i-1][j];
                boolean take = false;
                if(nums[i-1]<=j)
                take = dp[i-1][j-nums[i-1]];
                dp[i][j]=take||nottake;
            }
        }
        return dp[n][target];
    }
}