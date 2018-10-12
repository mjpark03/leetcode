class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] == target) {
                int first = mid, last = mid;
                
                while (first >= 0 && nums[first] == target)
                    first--;
                while (last <= nums.length-1 && nums[last] == target)
                    last++;
                
                return new int[]{first + 1, last - 1};
            }
            
            if (target < nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
     
        return new int[]{-1, -1};
    }
}
