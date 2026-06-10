class Solution {
    public int rob(int[] nums) {
        int prev1=0;
        int prev2=0;
        for(int money:nums){
            int curr = Math.max(prev2,prev1+money);
            prev1=prev2;
            prev2=curr;
        }
        return prev2;

    }
}