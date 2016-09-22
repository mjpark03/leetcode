public class Solution {
    public int findNthDigit(int n) {
        int len = 1;
        int number = 1;
        long size = 9;
        
        while(n > len * size) {
            n = n - len * (int)size;
            len = len + 1;
            number = number * 10;
            size = size * 10;
        }
        
        number = number + (n-1) / len;
        String digit = "" + (number + "").charAt((n-1) % len);
        return Integer.parseInt(digit);
    }
}
