class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == Integer.MIN_VALUE) return 1 / (x * myPow(x, Integer.MAX_VALUE));
        
        x = n < 0 ? 1 / x : x;
        n = n < 0 ? -n : n;
        
        double result = 1;
        while (n > 0) {
            if (n % 2 == 1) result *= x;
            x *= x;
            n = n / 2;
        }
        
        return result;
    }
}
