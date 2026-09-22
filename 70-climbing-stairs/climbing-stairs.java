class Solution {
    public int climbStairs(int n) {
        int prev=1;
        int now=2;
        if(n==1)return 1;
        if(n==2)return now;
        for(int i=2;i<n;i++){
            int next=prev+now;
            prev=now;
            now=next;
        }
        return now;
    }
}