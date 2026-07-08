class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans =0;
        int product=1;
        for(int i=0;i<nums.length;i++){
            int j=i;
            while(product<k && j<nums.length){
                product*=nums[j++];
                if(product<k)ans++;
            }
            product=1;
        }
        return ans;
    }
}