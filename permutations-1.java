class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        
        getPermutation(results, permutation, nums);
        return results;
    }
    
    private void getPermutation(List<List<Integer>> results, List<Integer> permutation, int[] nums) {
        if (nums.length == permutation.size()) {
            results.add(new ArrayList<Integer>(permutation));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (permutation.contains(nums[i]))
                continue;
            
            permutation.add(nums[i]);
            getPermutation(results, permutation, nums);
            permutation.remove(permutation.size() - 1);
        }
    }
}
