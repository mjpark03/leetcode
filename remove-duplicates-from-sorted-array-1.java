class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 1, p2 = 0;
        
        for ( ; p1 < nums.length; p1++ ) {
            if (nums[p1] != nums[p2])
                nums[++p2] = nums[p1];
        }
        
        return p2 + 1;
    }
}
