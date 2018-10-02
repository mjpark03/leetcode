class Solution {
    public String reverseString(String s) {
        StringBuilder result = new StringBuilder();
        
        for (char ch: s.toCharArray()) {
            result.insert(0, ch);
        }
        
        return result.toString();
    }
}
