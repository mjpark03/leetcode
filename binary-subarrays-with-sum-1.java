class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        int sum = 0, count = 0;
        for (int num: A) {
            sum += num;
            if (preSum.containsKey(sum - S))
                count += preSum.get(sum - S);
            
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
