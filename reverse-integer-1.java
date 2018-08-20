class Solution {
    public int reverse(int x) {
        
        int reverse = 0;
        boolean isNegative = false;
        
        if ( x < 0) {
            isNegative = true;
            x = x * -1;
        }
            
        while ( x != 0 ) {
            int remainder = x % 10;
            if(isOverflow(reverse, remainder))
                return 0;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }
        
        if (isNegative)
            reverse = reverse * -1;
        
        return reverse;
    }
    
    private boolean isOverflow(int reverse, int remainder) {
        if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && remainder > 7))
            return true;
        if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && remainder < -8))
            return true;
        return false;
    }
}
