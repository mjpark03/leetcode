class Solution {
    public int firstMissingPositive(int[] nums) {
        int size = nums.length;
        
        int index = 0;
        while (index < size) {
            if (nums[index] > 0 && nums[index] <= size && nums[nums[index]-1] != nums[index]) 
                swap(nums, index, nums[index] - 1);
            else
                index++;
        }
        
        for (int i = 0; i < size; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        
        return size + 1;
    }
    
    private void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
