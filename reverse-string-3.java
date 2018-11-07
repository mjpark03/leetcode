class Solution {
    public String reverseString(String s) {
        int length = s.length();
        if (length <= 1) return s;
        
        return reverseString(s.substring(length/2, length)) + reverseString(s.substring(0, length/2));
    }
}
