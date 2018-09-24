class Solution {
    public int countPrimes(int n) {
        int count = 0;
        
        boolean[] isPrimes = new boolean[n];
        init(isPrimes);
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!isPrimes[i])
                continue;
            
            for (int j = i * 2; j < n; j += i) {
                isPrimes[j] = false;
            }
        }
        
        for (int i = 2; i < n; i++) {
            if (isPrimes[i])
                count++;
        }
        
        return count;
    }
    
    private void init(boolean[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = true;
    }
}
