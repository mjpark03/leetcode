class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = getFirstIndex(nums, target);
        int last = getFirstIndex(nums, target + 1) - 1;
        
        if (first >= nums.length || nums[first] != target)
            return new int[]{-1, -1};
        
        return new int[]{first, last};
    }
    
    private int getFirstIndex(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (target <= nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        
        return right + 1;
    }
}
