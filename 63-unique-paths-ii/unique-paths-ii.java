class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        int i=0;
        while(i<n && obstacleGrid[0][i]!=1){
            dp[0][i]=1;
            i++;
        }
        int j=0;
        while(j<m && obstacleGrid[j][0]!=1){
            dp[j][0]=1;
            j++;
        }
        for(int k=1;k<m;k++){
            for(int l=1;l<n;l++){
                if(obstacleGrid[k][l]==1)continue;
                dp[k][l]=dp[k-1][l]+dp[k][l-1];
            }
        }
        return dp[m-1][n-1];
    }
}