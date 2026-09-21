class Solution {
    class Pair{
            int row;
            int col;
            int time;

            Pair(int row, int col, int time){
                this.row=row;
                this.col=col;
                this.time=time;

            }
    };
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int n=grid.length;
        int m= grid[0].length;
        int vis[][] = new int[n][m];
        int counting = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
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
        int count=0;
        int min=0;
        int rc[]={1,0,-1,0};
        int cc[]={0,-1,0,1};
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int rm=q.peek().time;
            min=Math.max(min,rm);
            q.remove();
            for(int i=0;i<4;i++){
                int ir = r+rc[i];
                int ic = c+cc[i];
                if(ir>=0 && ir <n && ic >=0 && ic<m && vis[ir][ic]==0 && grid[ir][ic]==1){
                    count++;
                    vis[ir][ic]=2;
                    q.add(new Pair(ir,ic,rm+1));
                }
            }
        }
        if(count!=counting)return -1;
        return min;
    }
}