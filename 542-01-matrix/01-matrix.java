class Node{
    int first;
    int second;
    int third;
    Node(int first,int second,int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}


class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] vis=new int[n][m];
        int[][] dist=new int[n][m];
        Queue<Node> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new Node(i,j,0));
                    vis[i][j]=1;
                }
                else{
                    vis[i][j]=0;
                }
            }
        }
        int[] drow = {0,1,0,-1};
        int[] dcol = {-1,0,1,0};

        while(!q.isEmpty()){
            int row = q.peek().first;
            int col=q.peek().second;
            int steps=q.peek().third;
            q.remove();
            dist[row][col]=steps;
            for(int i=0;i<4;i++){
                int r=row+drow[i];
                int c=col+dcol[i];
                if(r>=0 && r<n && c>=0 && c<m && vis[r][c]!=1){
                    q.add(new Node(r,c,steps+1));
                    vis[r][c]=1;
                }
            }
        }
        return dist;
    }
}