class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        int length = ransomNote.length();
        
        for (char ch: ransomNote.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        
        for (char ch: magazine.toCharArray()) {
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                
                if (count > 0) {
                    map.put(ch, count - 1);
                    length--;
                }
            }
        }
        
        if (length == 0)
            return true;
        else
            return false;
    }
}
