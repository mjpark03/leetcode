class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1, end = num;
        
        while (start <= end) {
            long mid = (start + end) / 2;
            long sqrt = mid * mid;
            
            if (sqrt == num)
                return true;
            else if (sqrt < num)
                start = (int) mid + 1;
            else
                end = (int) mid - 1;
        }
        
        return false;
    }
}
