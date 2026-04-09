class Solution {

    public void dfs(int[][] image , int i, int j, int color , int change){
        if(i<0 || j<0 || i>image.length-1 || j>image[0].length-1 || image[i][j]!=change)return;
        image[i][j]=color;
        dfs(image,i,j+1,color,change);
        dfs(image,i,j-1,color,change);
        dfs(image,i+1,j,color,change);
        dfs(image,i-1,j,color,change);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(color!=image[sr][sc]){
        dfs(image,sr,sc,color,image[sr][sc]);
        }
        return image;
    }
}