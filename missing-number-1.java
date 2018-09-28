class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int numsSum = nums[0];
        
        for (int i = 1; i < nums.length; i++)
            numsSum += nums[i];
        
        for (int i = 1; i <= nums.length; i++)
            sum += i;
        
        
        return sum - numsSum;
    }
}
