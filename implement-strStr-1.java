class Solution {
    public int strStr(String haystack, String needle) {
        int size = needle.length();
        
        for (int i = 0; i <= haystack.length()-size; i++) {
            if (equals(haystack, i, i+size, needle))
                return i;
        }
        
        return -1;
    }
    
    private boolean equals(String haystack, int start, int end, String needle) {
        int index = 0;
        
        for (int i = start; i < end; i++) {
            if (haystack.charAt(i) != needle.charAt(index++))
                return false;
        }
        
        return true;
    }
}
