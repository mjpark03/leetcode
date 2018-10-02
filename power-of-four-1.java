class Solution {
    public boolean isPowerOfFour(int num) {
        
        while (num > 0 && num % 4 == 0) {
            num /= 4;
        }
        
        if (num == 1)
            return true;
        else 
            return false;
    }
}
