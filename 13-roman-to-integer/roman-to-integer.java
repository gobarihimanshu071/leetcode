class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i!=0 && s.charAt(i)=='V' && s.charAt(i-1)=='I'){
                ans+=3;
            }
            else if(i!=0 && s.charAt(i)=='X' && s.charAt(i-1)=='I'){
                ans+=8;
            }
            else if(i!=0 && s.charAt(i)=='L' && s.charAt(i-1)=='X'){
                ans+=30;
            }
            else if(i!=0 && s.charAt(i)=='C' && s.charAt(i-1)=='X'){
                ans+=80;
            }
            else if(i!=0 && s.charAt(i)=='D' && s.charAt(i-1)=='C'){
                ans+=300;
            }
            else if(i!=0 && s.charAt(i)=='M' && s.charAt(i-1)=='C'){
                ans+=800;
            }
            else{
                ans+=map.get(s.charAt(i));
            }
        }
        return ans;
    }
}