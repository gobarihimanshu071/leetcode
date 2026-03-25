class Solution {
    public List<String> construct(char[][] board){
        List<String> res = new ArrayList<>();
        for(char[] row : board){
            res.add(new String(row));
        }
        return res;
    }



    public void solve(int col,int n, char[][] board, int[] line, int[] lowerDiagonal, int[] upperDiagonal,List<List<String>> ans){

        if(col==n){
            ans.add(construct(board));
            return;
        }

        for(int row = 0 ; row<n;row++){
            if(line[row]==0 && lowerDiagonal[col+row]==0 && upperDiagonal[n-1 + col-row]==0){
                board[row][col]='Q';
                line[row]=1;
                lowerDiagonal[col+row]=1;
                upperDiagonal[n-1+col-row]=1;
                solve(col+1,n,board,line,lowerDiagonal,upperDiagonal,ans);
                board[row][col]='.';
                line[row]=0;
                lowerDiagonal[col+row]=0;
                upperDiagonal[n-1+col-row]=0;

            }

        }
    }



    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for(char[] row : board){
            Arrays.fill(row,'.');
        }
        int[] line = new int[n];
        int[] lowerDiagonal = new int[2*n-1];
        int[] upperDiagonal = new int[2*n-1];

        solve(0,n,board,line,lowerDiagonal,upperDiagonal,ans);
        return ans;


            }
}