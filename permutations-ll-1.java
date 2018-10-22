class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        
        List<Integer> permutation = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        getPermutations(results, permutation, nums, visited);
        
        return results;
    }
    
    private void getPermutations(List<List<Integer>> results, List<Integer> permutation, int[] nums, boolean[] visited) {
        if (nums.length == permutation.size()) {
            results.add(new ArrayList<>(permutation));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (visited[i])
                continue;
            
            if (i != 0 && nums[i] == nums[i-1] && !visited[i-1])
                continue;
            
            permutation.add(nums[i]);
            visited[i] = true;
            getPermutations(results, permutation, nums, visited);
            permutation.remove(permutation.size() - 1);
            visited[i] = false;
        }
    }
}
