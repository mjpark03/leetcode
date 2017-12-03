class Solution {
    public boolean validPalindrome(String s) {
        
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1, count = 0;
        
        while( left <= right ) {
            if ( chars[left] != chars[right] )
                return validPalindrome(chars, left + 1, right) || validPalindrome(chars, left, right - 1);
        
            left++; right--;
        }
        
        return true;
    }
    
    private boolean validPalindrome(char[] chars, int left, int right) {
        while ( left <= right ) {
            if ( chars[left] != chars[right] )
                return false;
            
            left++; right--;
        }
        
        return true;
    }
}