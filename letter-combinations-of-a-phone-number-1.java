class Solution {
    private String[] MAP = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if (digits.length() == 0) return results;
        
        getCombinations(results, digits, "", 0);
        return results;
    }
    
    private void getCombinations(List<String> results, String digits, String combination, int index) {
        if (index == digits.length()) {
            results.add(combination);
            return;
        }
        
        String letters = MAP[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) 
            getCombinations(results, digits, combination + letters.charAt(i), index + 1);
    }
}
