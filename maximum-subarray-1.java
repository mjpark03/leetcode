public class Solution {
    public int maxSubArray(int[] nums) {
        
        int[] sum = new int[nums.length];

        sum[0] = nums[0];
        int max = sum[0];
        
        for(int i=1; i<nums.length; i++) {
            sum[i] = Math.max(nums[i], sum[i-1] + nums[i]);
            max = Math.max(sum[i],max);
        }
        
        return max;
    }
}
