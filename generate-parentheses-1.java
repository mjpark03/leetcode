class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        
        getCombinations(results, "", 0, 0, n);
        return results;
    }
    
    private void getCombinations(List<String> results, String combination, int open, int close, int n) {
        if (close == n) {
            results.add(combination);
            return;
        }
        
        if (open < n)
            getCombinations(results, combination + "(", open + 1, close, n);
        if (close < open)
            getCombinations(results, combination + ")", open, close + 1, n);
    }
}
