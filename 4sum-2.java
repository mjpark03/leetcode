class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++) {
            if (i != 0 && nums[i] == nums[i-1])
                continue;
            
            for (int j = i+1; j < nums.length-2; j++) {
                if (j != i+1 && nums[j] == nums[j-1])
                    continue;
                
                int start = j + 1, end = nums.length - 1;
                while (start < end) {
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        result.add(list);
                        
                        start++;
                        end--;
                        
                        while (start < end && nums[start] == nums[start-1])
                            start++;
                        while (start < end && nums[end] == nums[end+1])
                            end--;

                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        
        return result;
    }
}
