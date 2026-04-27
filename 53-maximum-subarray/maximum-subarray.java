class Solution {
    public int maxSubArray(int[] nums) {
        int massum=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],nums[i]+currentSum);
            massum=Math.max(currentSum,massum);
        }
        return massum;
    }
}