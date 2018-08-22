class Solution {
    public int countSubstrings(String s) {
        
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subString = s.substring(i, j+1);
                if (isPalindromic(subString))
                    count++;
            }
        }
        
        return count;
    }
    
    private boolean isPalindromic(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
        }
        
        return true;
    }
}
