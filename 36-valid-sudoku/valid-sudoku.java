class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
        int[] count = new int[10];
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                int num=board[i][j]-'0';
                if(count[num]==1)return false;
                count[num]=1;
            }
        }
        for(int j=0;j<9;j++){
            int[] count = new int[10];

            for(int i=0;i<9;i++){
                if(board[i][j]=='.') continue;

                int num = board[i][j]-'0';

                if(count[num]==1) return false;
                count[num]=1;
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                int[] count = new int[10];
                for(int m=0;m<3;m++){
                    for(int n=0;n<3;n++){
                        if(board[i+m][j+n]=='.')continue;
                        int num = board[i+m][j+n]-'0';
                        if(count[num]==1)return false;
                        count[num]=1;
                    }
                }
            }
        }
        return true;
    }
}