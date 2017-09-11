class Solution {
    public int rob(int[] nums) {
        
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int[] amount = new int[nums.length];
        
        amount[0] = nums[0];
        amount[1] = Math.max(nums[0], nums[1]);
        
        for (int i=2; i<nums.length; i++)
            amount[i] = Math.max(amount[i-2] + nums[i], amount[i-1]);
        
        return amount[nums.length-1];
    }
}