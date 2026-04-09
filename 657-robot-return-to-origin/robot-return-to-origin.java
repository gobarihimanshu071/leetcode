class Solution {
    public boolean judgeCircle(String moves) {
        int A=0;
        int B=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                B++;
            }
            else if(ch=='D'){
                B--;
            }
            else if(ch=='R'){
                A++;
            }
            else{
                A--;
            }
        }
        if(A==0 && B==0)return true;
        return false;
    }
}