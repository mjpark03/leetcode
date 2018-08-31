class Solution {
    public String addBinary(String a, String b) {
        
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;
        String result = "";
        
        while (aLength >= 0 || bLength >= 0) {
            int first = 0;
            int second = 0;
            
            if (aLength >= 0)
                first = a.charAt(aLength--) - '0';
            if (bLength >= 0)
                second = b.charAt(bLength--) - '0';
            
            int current = (first + second + carry) % 2;
            carry = (first + second + carry) / 2;
            
            result = current + result;
        }

        if (carry == 1)
            result = "1" + result;
        
        return result;
    }
}
