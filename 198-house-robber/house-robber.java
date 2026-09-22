class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int first=nums[0];
        int second=nums[1];
        for(int i=2;i<nums.length;i++){
            int third=first+nums[i];
            first=Math.max(first,second);
            second=third;
        }
        return Math.max(first,second);
        
    }
}