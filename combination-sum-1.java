class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        
        List<Integer> combination = new ArrayList<>();
        findCombination(results, combination, candidates, target, 0);
        return results;
    }
    
    private void findCombination(List<List<Integer>> results, List<Integer> combination, int[] candidates, int remains, int start) {
        if (remains == 0) {
            results.add(new ArrayList<Integer>(combination));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            if (remains < candidates[i])
                break;
            
            combination.add(candidates[i]);
            findCombination(results, combination, candidates, remains - candidates[i], i);
            combination.remove(combination.size() - 1);
        }
    }
}
