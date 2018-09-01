class Solution {
    public int mySqrt(int x) {
        
        long num = 1;
        long result = 1;
        
        while (result <= x) {
            num++;
            result = num * num;
        }
        
        return (int)num-1;
    }
}
