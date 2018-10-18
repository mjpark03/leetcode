class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        
        getCombination(results, combination, 1, n, k);
        return results;
    }
    
    private void getCombination(List<List<Integer>> results, List<Integer> combination, int start, int n, int k) {
        if (k == combination.size()) {
            results.add(new ArrayList<Integer>(combination));
            return;
        }
        
        for (int i = start; i <= n; i++) {
            combination.add(i);
            getCombination(results, combination, i+1, n, k);
            
            combination.remove(combination.size() - 1);
        }
    }
}
