public class Solution {

    public boolean isPalindrome(int x) {

        String[] splitX = Integer.toString(x).split(" ");
        StringBuffer s = new StringBuffer();
        
        if(splitX.length > 1) {
            for(int i=0; i<splitX.length; i++) {
                s.append(splitX[i]);
            }
        } else {
            s.append(splitX[0]);
        }
        
        StringBuffer reverseS = new StringBuffer(s.toString());
        reverseS.reverse();
        
        return s.toString().equals(reverseS.toString());
        
    }
}
