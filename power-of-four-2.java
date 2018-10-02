class Solution {
    public boolean isPowerOfFour(int num) {
        
        if (num == 1)
            return true;
        if (num == 0)
            return false;
        
        return num % 4 == 0 && isPowerOfFour(num / 4);
    }
}
