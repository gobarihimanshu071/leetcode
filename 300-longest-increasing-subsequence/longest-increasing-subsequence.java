class Solution {

    public static int f(int idx,int[] nums,int prev,int dp[][]){
        
        if(idx==nums.length)return 0;
        if(dp[idx][prev+1]!=-1)return dp[idx][prev+1];
        int nottake = f(idx+1,nums,prev,dp);
        int take =  0;
        if(prev==-1 || nums[idx]>nums[prev])
        take = 1+f(idx+1,nums,idx,dp); 

        return dp[idx][prev+1]= Math.max(nottake,take);
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int ror[]:dp)
        Arrays.fill(ror,-1);
        int ans = f (0,nums,-1,dp);
        return ans;
    }
}