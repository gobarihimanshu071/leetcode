class Solution {
    public int maxDepth(String s) {
        char[] res = s.toCharArray();
        int max=0;
        int num=0;
        for(int i=0;i<s.length();i++){
            if(res[i]=='('){
                num++;
            }
            else if(res[i]==')'){
                num--;
            }
            max=Math.max(num,max);
        }
        return max;
    }
}