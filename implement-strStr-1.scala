object Solution {
    def strStr(haystack: String, needle: String): Int = {
        strStr(haystack, 0, needle)
    }
    
    def strStr(haystack: String, start: Int, needle: String): Int = {
        val size = needle.length()
        if (haystack.length() < start + size)
            return -1
        
        if (haystack.substring(start, start + size).equals(needle))
            return start
        
        strStr(haystack, start + 1, needle);
    }
}
