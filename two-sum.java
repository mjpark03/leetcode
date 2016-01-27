public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = {0,0};
        int remain;
        int current;
        
        for (int i=0; i<nums.length; i++) {
            
            current = nums[i];
            result[0] = i+1;
            remain = target - current;
            
            for (int j=i+1; j<nums.length; j++) {
                if (remain == nums[j]) {
                    result[1] = j+1;
                    return result;
                 }
            }
        
            result[0] = 0;
        }
        
        return result;
    }
}
