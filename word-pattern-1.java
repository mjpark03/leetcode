class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        String[] words = str.split(" ");
        
        if (pattern.length() != words.length)
            return false;
        
        for (int i = 0; i < words.length; i++) {
            char key = pattern.charAt(i);
            
            if (map.containsKey(key)) {
                if (!map.get(key).equals(words[i]))
                    return false;
            } else {
                if (map.containsValue(words[i]))
                    return false;
                
                map.put(key, words[i]);
            }
        }
        
        return true;
    }
}
