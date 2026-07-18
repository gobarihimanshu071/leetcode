class Solution {
    int[][] dp;
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    int rows,cols;

    private int dps(int i, int j, int[][] matrix){
        if(dp[i][j]!=0)return dp[i][j];

        int longest = 1;

        for(int[] dir : dirs){
            int nr = i + dir[0];
            int nc = j + dir[1];

            if(nr>=0 && nr<rows && nc>=0 && nc <cols && matrix[i][j]<matrix[nr][nc]){
                longest = Math.max(longest,1+dps(nr,nc,matrix));
            }
        }
        dp[i][j]=longest;
        return longest;
    }

    public int longestIncreasingPath(int[][] matrix) {
        rows = matrix.length;
        cols = matrix[0].length;
        dp = new int[rows][cols];

        int ans = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                ans = Math.max(ans,dps(i,j,matrix));
            }
        }
        return ans;

    }
}