class Solution {
    public int tribonacci(int n) {
        if(n==0)return 0;
        int f=0;
        int s=1;
        int t=1;
        for(int i=3;i<=n ;i++){
            int curr=f+s+t;
            f=s;
            s=t;
            t=curr;
        }
        return t;
    }
}