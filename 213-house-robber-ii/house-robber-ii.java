class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int prev=0;
        int p_prev=0;
        for(int i=0;i<n-1;i++){
            int curr=Math.max(prev,p_prev+nums[i]);
            p_prev=prev;
            prev=curr;
        } 
        int one =0;
        int two=0;
        for(int i=n-1;i>0;i--){
            int curr=Math.max(one,two+nums[i]);
            two=one;
            one=curr;
        } 
        return Math.max(prev,one);
    }
}