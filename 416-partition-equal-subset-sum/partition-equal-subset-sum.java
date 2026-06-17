class Solution {
    Boolean dp[][];
    public static boolean f(int idx,int nums[], int sum , Boolean dp[][]){
        if(sum==0)return true;
        if(idx==0)return false;
        if(dp[idx][sum]!=null)return dp[idx][sum];
        boolean nottake = f(idx-1,nums,sum,dp);
        boolean take = false;
        if(sum>=nums[idx-1])
         take = f(idx-1,nums,sum-nums[idx-1],dp);
        return dp[idx][sum] = take||nottake;
    }

    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum%2!=0)return false;
        dp = new Boolean[nums.length+1][sum/2+1];
        return f(nums.length,nums,sum/2,dp);
    }
}