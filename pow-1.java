class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == Integer.MIN_VALUE) return 1 / (x * myPow(x, Integer.MAX_VALUE));
        
        x = n < 0 ? 1/x : x;
        n = n < 0 ? -n : n;
        
        return n % 2 == 0 ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
}
