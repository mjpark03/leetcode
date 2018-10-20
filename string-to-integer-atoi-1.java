class Solution {
    public int myAtoi(String str) {
        if (str.length() == 0)
            return 0;
        
        long result = 0, sign = 1;
        int index = 0;
        
        while (index < str.length() && str.charAt(index) == ' ')
            index++;
        
        if (index < str.length() && (str.charAt(index) == '+' || str.charAt(index) == '-'))
            sign = str.charAt(index++) == '+' ? 1 : -1;
        
        while (index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9') {
            result = result * 10 + (str.charAt(index) - '0');
            if (sign == 1 && result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && -1 * result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            
            index++;
        }
        
        return Math.toIntExact(result * sign);
    }
} 
