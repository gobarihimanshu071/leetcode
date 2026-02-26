class Solution {
    public boolean isMatch(String s, String p) {
        int i=0;
        int j=0;
        int n=s.length();
        int m=p.length();
        int match=0;
        int star=-1;
        if(m==1 && p.charAt(j)=='*')return true;
        while(i<n ){
            if( j<m && (s.charAt(i) == p.charAt(j) || p.charAt(j)=='?')){
                i++;
                j++;
            }
            else if(j<m && p.charAt(j)=='*'){
                star=j;
                match=i;
                j++;
            }
            else if(star!=-1){
                j = star+1;
                match++;
                i=match;
            }
            else{
                return false;
            }

        }
        while(j<m && p.charAt(j)=='*'){
            j++;
        }
        return m==j;
    }
}