class Solution {

    public void dfs(int i, int j , char[][] grid){
        if(i<0 || j>grid[0].length-1 || i>grid.length-1 || j<0)return;
        if(grid[i][j]=='0')return;
        grid[i][j]='0';
        dfs(i,j-1,grid);
        dfs(i,j+1,grid);
        dfs(i+1,j,grid);
        dfs(i-1,j,grid);
    }

    public int numIslands(char[][] grid) {
        int noOfIslands=0;
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    noOfIslands++;
                    dfs(i,j,grid);
                }
            }
        }
        return noOfIslands;
    }
}