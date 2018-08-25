class Solution {
    public int removeElement(int[] nums, int val) {
        
        int p1 = 0, p2 = 0;
        
        for ( ; p1 < nums.length; p1++) {
            if (nums[p1] == val)
                continue;
            
            nums[p2] = nums[p1];
            p2++;
        }
        
        return p2;
    }
}
