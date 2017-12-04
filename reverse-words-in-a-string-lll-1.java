class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        String result = "";
        
        for (String word: words) {
            result += new StringBuilder(word).reverse().toString();
            result += " ";
        }
        
        return result.substring(0, result.length() - 1);
    }
}