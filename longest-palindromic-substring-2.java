class Solution {
    public String longestPalindrome(String s) {
        int currentMaxSize = 0;
        String result = "";
        
        for (int end = 0; end < s.length(); end++) {
            int start = end - currentMaxSize;
            if (isPalindrome(s, start, end)) {
                currentMaxSize += 1;
                result = s.substring(start, end+1);
            } else if (isPalindrome(s, start-1, end)) {
                currentMaxSize += 2;
                result = s.substring(start-1, end+1);
            }
        }
        
        return result;
    }
    
    private boolean isPalindrome(String s, int start, int end) {
        if (start < 0) return false;
        
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        
        return true;
    }
}
