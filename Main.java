class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(char c: s.toCharArray()){
            int numCount=hm.getOrDefault(c, 0)+1;
            hm.put(c, numCount);
        }
        for(char c: t.toCharArray()){
            int numCount =  hm.getOrDefault(c, 0)-1;
            if(numCount<0) return false;
            hm.put(c, numCount);
        }
        return true;
    }
}
