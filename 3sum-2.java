class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (nums.length < 3)
            return result;
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                int start = i + 1, end = nums.length - 1;

                while (start < end) {
                    int sum = nums[i] + nums[start] + nums[end];

                    if (sum == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        result.add(list);

                        start++;
                        end--;

                        while (start < end && nums[start] == nums[start-1])
                            start++;
                        while (start < end && nums[end] == nums[end+1])
                            end--;

                    } else if (sum > 0) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        
        return result;
    }
}
