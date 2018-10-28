class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int[] preSum = new int[30001];
        preSum[0] = 1;
        
        int sum = 0, count = 0;
        for (int num: A) {
            sum += num;
            if (sum - S >= 0) count += preSum[sum - S];
            preSum[sum]++;
        }
        
        return count;
    }
}
