class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int index1 = 0, index2 = 0;
        
        while (index1 < name.length() && index2 < typed.length()) {
            char ch1 = name.charAt(index1);
            char ch2 = typed.charAt(index2);
            
            if (ch1 == ch2) {
                index1++;
                index2++;
            } else {
                if (index1 == 0 || name.charAt(index1 - 1) == typed.charAt(index2)) {
                    index2++;
                } else {
                    return false;
                }
            }
        }
        
        return index1 == name.length() ? true : false;
    }
}
