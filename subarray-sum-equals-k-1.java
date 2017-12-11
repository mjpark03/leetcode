class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int sum = 0, count = 0;
        
        for (int base = 0; base < nums.length; base++) {
            sum = nums[base];
            if (sum == k) count++;
            
            for (int index = base + 1; index < nums.length; index++) {
                sum += nums[index];
                if (sum == k) count++;
            }
        }
        
        return count;
    }
}