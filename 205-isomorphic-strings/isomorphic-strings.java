class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> fors = new HashMap<>();
        HashMap<Character,Integer> fort = new HashMap<>();

        int i=0;
        while(i<s.length()){
            if(!fors.containsKey(s.charAt(i))){
                fors.put(s.charAt(i),i);
            }
            if(!fort.containsKey(t.charAt(i))){
                fort.put(t.charAt(i),i);
            }
            if(!fors.get(s.charAt(i)).equals(fort.get(t.charAt(i)))){
                return false;
            }i++;
        }
        return true;
    }
}