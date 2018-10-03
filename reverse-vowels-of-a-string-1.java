class Solution {
    public String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;
        char[] sChars = s.toCharArray();
        
        while (start < end) {
            if (!isVowel(s.charAt(start))) {
                start++;
                continue;
            }
            
            if (!isVowel(s.charAt(end))) {
                end--;
                continue;
            }
            
            char temp = sChars[start];
            sChars[start] = sChars[end];
            sChars[end] = temp;

            start++;
            end--;   
        }
        
        return new String(sChars);
    }
    
    private boolean isVowel(char ch) {
        if (ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u'
           | ch == 'A' | ch == 'E' | ch == 'I' | ch == 'O' | ch == 'U')
            return true;
        
        return false;
    }
}

