class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        
        getCombinations(results, new StringBuilder(""), 0, 0, n);
        return results;
    }
    
    private void getCombinations(List<String> results, StringBuilder combination, int open, int close, int n) {
        if (close == n) {
            results.add(combination.toString());
            return;
        }
        
        if (open < n) {
            getCombinations(results, combination.append("("), open + 1, close, n);
            combination.deleteCharAt(combination.length() - 1);
        }
        if (close < open) {
            getCombinations(results, combination.append(")"), open, close + 1, n);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
