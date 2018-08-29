class Solution {
    public int lengthOfLastWord(String s) {
        int size = s.length();
        int count = 0;
        boolean nonSpace = false;
        
        for (int i = size-1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
                nonSpace = true;
            } else {
                if (nonSpace) return count;
            }
        }
        
        return count;
    }
}
