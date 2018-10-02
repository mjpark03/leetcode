class Solution {
    public String reverseString(String s) {
        char[] sChars = s.toCharArray();
        int start = 0, end = s.length() - 1;
        
        while (start < end) {
            char temp = sChars[start];
            sChars[start++] = sChars[end];
            sChars[end--] = temp;
        }
        
        return new String(sChars);
    }
}
