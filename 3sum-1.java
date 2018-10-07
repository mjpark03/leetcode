class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        
        if (nums.length < 3)
            return result;
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int start = i + 1, end = nums.length - 1;
            
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    
                    if (!set.contains(list)) {
                        set.add(list);
                        result.add(list);
                    }
                    
                    start++;
                    end--;
                } else if (sum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        
        return result;
    }
}
