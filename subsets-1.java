class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        
        getSubsets(results, subset, nums, 0);
        return results;
    }
    
    private void getSubsets(List<List<Integer>> results, List<Integer> subset, int[] nums, int start) {
        results.add(new ArrayList<>(subset));
        
        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            getSubsets(results, subset, nums, i+1);
            subset.remove(subset.size() - 1);
        }
    }
}
