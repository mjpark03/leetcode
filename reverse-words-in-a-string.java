public class Solution {
    public String reverseWords(String s) {
        
        String[] splitS = s.split(" ");
        StringBuffer result = new StringBuffer();
        
        for(int i=splitS.length-1; i>=0; i--) {
            String temp = splitS[i];
            
            if(temp.length() > 0) {
                result.append(temp);
                result.append(" ");
            }
        }
            
        if(result.length() > 0)
            return result.substring(0, result.length()-1);
        else
            return "";
    }
}
