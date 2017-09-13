class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        char[] sArray = s.toCharArray();
        int size = sArray.length;
        if (size <= 1) return false;
        
        boolean isSub = false;
        int subLength = 1;
        int subCount = 0;
        
        for(int i=1; i<size; i++) {
            
            if (size % subLength != 0) {
                subLength++;
                continue;
            }
            
            char ch = sArray[i];
            boolean isSameBefore = (ch == sArray[i-subLength]);
            boolean isSameAfter = (i+subLength >= size) ? true : (sArray[i+subLength] == ch);
            
            if (isSameBefore && isSameAfter) {
                subCount++;
                
                if (subLength == subCount) {
                    isSub = true;
                    subCount = 0;
                }
            } else {
                isSub = false;
                subLength = i+1;
                subCount = 0;
            }
        }
        
        return isSub;
    }
}