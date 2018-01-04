class Solution {
    public int dominantIndex(int[] nums) {
        
        int max = nums[0], index = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums [i];
                index = i;
            }
        }       
        
        for (int num: nums) {
            if (num == max) continue;
            if ((num * 2) > max) return -1;
        }
        
        return index;
    }
}