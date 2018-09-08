class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0, end = s.length()-1;
        
        while (start < end) {
            char ch1 = s.charAt(start);
            char ch2 = s.charAt(end);
            
            if (!isValidCharacter(ch1)) {
                start++;
                continue;
            }
            
            if (!isValidCharacter(ch2)) {
                end--;
                continue;
            }
            
            if (ch1 != ch2)
                return false;
            
            start++;
            end--;
        }
        
        return true;
    }
    
    private boolean isValidCharacter(char ch) {
        if (ch >= 'a' && ch <= 'z')
            return true;
        
        if (ch >= '0' && ch <= '9')
            return true;
        
        return false;
    }
}
