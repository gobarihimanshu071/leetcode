class Solution {

    class Pair{
        int row;
        int col;
        int tm;
        Pair(int row, int col, int tm){
            this.row=row;
            this.col=col;
            this.tm=tm;
        }
    }

    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis = new int[n][m];
        int counting=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    q.add(new Pair(i,j,0));
                }
                else if(grid[i][j]==0){
                    vis[i][j]=0;
                }
                else{
                    counting++;
                    vis[i][j]=0;
                }
            }
        }
        int cm=0;
        int rm=0;
        int[] cr = {0,1,0,-1};
        int[] rc = {-1,0,1,0};
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;
            rm=Math.max(rm,t);
            q.remove();

            for(int i=0;i<4;i++){
                int nrow=r+rc[i];
                int ncol=c+cr[i];
                if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=1;
                    cm++;
                }
            }
        }
        if(cm!=counting)return -1;
        return rm;
    }
}