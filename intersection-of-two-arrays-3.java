class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Set<Integer> resultSet = new HashSet<>();
        
        for (int num: nums2) {
            if (existInNums1(nums1, num)) {
                resultSet.add(num);
            }
        }
        
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num: resultSet)
            result[index++] = num;
        
        return result;
    }
    
    private boolean existInNums1(int[] nums, int num) {
        int start = 0, end = nums.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == num) return true;
            else if (num < nums[mid]) end = mid - 1;
            else start = mid + 1;
        }
        
        return false;
    }
}
