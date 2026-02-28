class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                
            }
        }
        for(int i=0;i<matrix.length;i++){
            int r=0;
            int l=matrix.length-1;
            while(r<l){
                int temp = matrix[i][r];
                matrix[i][r]=matrix[i][l];
                matrix[i][l]=temp;
                r++;
                l--;
            }
        }
    }
}