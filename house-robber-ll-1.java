
class Solution {
    public int rob(int[] nums) {
        
        int size = nums.length;
        
        if (size == 0) return 0;
        if (size == 1) return nums[0];
        
        return Math.max(rob(nums, 0, size-2), rob(nums, 1, size-1));
    }
    
    private int rob(int[] nums, int start, int end) {
        
        if ((end - start + 1) <= 1) return nums[start];
        
        int[] amount = new int[end+1];

        amount[start] = nums[start];
        amount[start+1] = Math.max(nums[start], nums[start+1]);
        
        for (int i = start + 2; i <= end; i++) {
            amount[i] = Math.max(amount[i-2] + nums[i], amount[i-1]);
        }
        
        return amount[end];
    }
}