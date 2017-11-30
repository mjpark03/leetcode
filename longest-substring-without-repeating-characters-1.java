class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start = 0, end = 0, max = 0;
        Set<Character> set = new HashSet<Character>();
        
        while (end < s.length()) {
            char ch = s.charAt(end);
            
            if (!set.contains(ch)) {
                set.add(ch);
                max = Math.max(max, set.size());
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        
        return max;
    }
}