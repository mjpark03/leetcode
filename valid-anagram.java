public class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;
            
        if(s.length()==0 && t.length()==0)
            return true;
            
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        sort(sArr, 0, s.length()-1);
        sort(tArr, 0, t.length()-1);
        
        String sortS = new String(sArr);
        String sortT = new String(tArr);
        
        if(sortS.equals(sortT))
            return true;
        else
            return false;
        
    }
    
    public void sort(char[] str, int i, int j) {
        
        if(i>=j)
            return;
        
        int start = i, end = j;
        char pivot = str[start];
        char temp;
        
        i = start-1;
        j = end+1;
        
        while(i<j) {
            
            i++;
            while(pivot > str[i])
                i++;
                
            j--;
            while(pivot < str[j])
                j--;
                
            if(i<=j) {
                temp = str[j];
                str[j] = str[i];
                str[i] = temp;
            }
        }
    
        sort(str, start, j);
        sort(str, j+1, end);
    }
}
