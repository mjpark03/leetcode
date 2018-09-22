class Solution {
    public boolean isHappy(int n) {
        Set<Integer> sumSet = new HashSet<>();
        
        while (!sumSet.contains(n)) {
            sumSet.add(n);
            n = getSum(n);
            
            if (n == 1)
                return true;
        }
        
        return false;
    }
    
    private int getSum(int n) {
        int sum = 0;
            
        while (n != 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        
        return sum;
    }
}
