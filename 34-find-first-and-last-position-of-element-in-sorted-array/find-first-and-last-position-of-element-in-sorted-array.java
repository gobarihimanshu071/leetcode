class Solution {

    public int binary(int[] nums,  int target, boolean isMovingLeft){
        int left=0;
        int right = nums.length-1;
        int idx=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;

            }
            else{
                idx=mid;
                if(isMovingLeft){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return idx;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int left = binary(nums,target,true);
        int right = binary(nums,target,false);
        result[0]=left;
        result[1]=right;
        return result;        
    }
}