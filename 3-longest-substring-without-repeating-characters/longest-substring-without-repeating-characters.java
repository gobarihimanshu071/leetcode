class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> map = new HashSet<>();
        int left=0;
        int max_length=0;
        for(int right =0;right < n;right++){
            while(map.contains(s.charAt(right))){
                map.remove(s.charAt(left));
                left++;
            }
            map.add(s.charAt(right));
            max_length=Math.max(max_length,right-left+1);
        }
        return max_length;
    }
}