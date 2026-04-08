class Solution {

    public void dfs(int node , boolean[] visit, int[][] isConnected){
        visit[node]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i]==1 && visit[i]!=true){
                dfs(i,visit,isConnected);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visit = new boolean[n];
        int noOfComponents=0;

        for(int i=0;i<n;i++){
            if(!visit[i]){
                noOfComponents++;
                dfs(i,visit,isConnected);
            }
        }
        return noOfComponents;
    }
}