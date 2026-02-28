class Solution {

    public void rotate(int[][] mat){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int r=0;
            int l=n-1;
            while(r<l){
                int temp=mat[i][r];
                mat[i][r]=mat[i][l];
                mat[i][l]=temp;
                r++;
                l--;
            }
        }
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            rotate(mat);
            if(isEqual(mat,target)==true){
                return true;
            }
        }
        return false;
        
    }

    public boolean isEqual(int[][] mat,int[][] target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]!=target[i][j])return false;
            }
        }
        return true;
    }
}