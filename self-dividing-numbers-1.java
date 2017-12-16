class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> result = new ArrayList<>();
        
        while (left <= right) {
            if (checkSelfDividingNumber(left)) result.add(left);
            left++;
        }
        
        return result;
    }
    
    private boolean checkSelfDividingNumber(int num) {
        int dividend = num, divisor = 0;
        
        while (dividend != 0) {
            divisor = dividend % 10;
            if (divisor == 0 || num % divisor != 0) return false;
            dividend /= 10;
        }
        
        return true;
    }
}