class Solution {

    public static void f(int idx, int nums[], int target, int sum, int count[]){
        if(idx<0){
            if(sum==target)count[0]++;
            return;
        }
        f(idx-1,nums,target,sum+nums[idx],count);
        f(idx-1,nums,target,sum-nums[idx],count);
        return; 
    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        int[] count=new int[1];
        f(nums.length-1, nums,target,sum,count);
        return count[0];
    }
}