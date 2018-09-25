class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (map.containsKey(sChar)) {
                if (map.get(sChar) != tChar)
                    return false;
            } else {
                if (map.containsValue(tChar))
                    return false;
                map.put(sChar, tChar);
            }
        }
        
        return true;
    }
}
