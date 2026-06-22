class Solution {

    public static int f(
        int idx,
        int nums[],
        int target,
        int dp[][]){

        if(idx < 0){
            return target == 0 ? 1 : 0;
        }

        if(dp[idx][target] != -1)
            return dp[idx][target];

        int notTake =
            f(idx-1, nums, target, dp);

        int take = 0;

        if(nums[idx] <= target)
            take =
                f(idx-1,
                  nums,
                  target-nums[idx],
                  dp);

        return dp[idx][target]
               = take + notTake;
    }

    public int findTargetSumWays(
            int[] nums,
            int target) {

        int sum = Arrays.stream(nums).sum();

        if((sum + target) < 0 ||
           (sum + target) % 2 != 0)
            return 0;

        int p = (sum + target) / 2;

        int[][] dp =
            new int[nums.length][p + 1];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        return f(nums.length - 1,
                 nums,
                 p,
                 dp);
    }
}