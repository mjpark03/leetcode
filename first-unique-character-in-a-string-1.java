class Solution {
    public int firstUniqChar(String s) {
        
        int[] count = new int[26];
        
        for (char ch: s.toCharArray()) {
            count[ch - 'a']++;
        }
        
        int index = 0;
        for (char ch: s.toCharArray()) {
            if (count[ch - 'a'] == 1)
                return index;
            index++;
        }
    
        return -1;
    }
}
