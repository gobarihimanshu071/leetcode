class Solution {
    public int maxProduct(int[] nums) {
        int max_product_so_far=nums[0];
        int min_product_so_far=nums[0];
        int max_product=nums[0];

        for(int i=1;i<nums.length;i++){
            int temp = max_product_so_far;
            max_product_so_far = Math.max(nums[i],Math.max(nums[i]*min_product_so_far,nums[i]*max_product_so_far));
            min_product_so_far = Math.min (nums[i],Math.min(nums[i]*min_product_so_far,nums[i]*temp));
            max_product = Math.max(max_product,max_product_so_far);
        }
        return max_product;
    }
}