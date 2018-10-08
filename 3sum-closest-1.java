class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int diffMin = Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int start = i + 1, end = nums.length - 1;
            
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                int diff = Math.abs(target - sum);
                
                if (diff == 0)
                    return sum;
            
                if (diff < diffMin) {
                    result = sum;
                    diffMin = diff;
                }

                if (sum < target)
                    start++;
                else
                    end--; 
            }
        }
        
        return result;
    }
}
