class Solution {
    public String largestNumber(int[] nums) {
        String[] numStrings = new String[nums.length];
        String result = "";
        
        int index = 0;
        for (int num: nums)
            numStrings[index++] = num + "";
        
        Arrays.sort(numStrings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String str1 = a + b;
                String str2 = b + a;
                return str1.compareTo(str2);
            }
        });
        
        if (numStrings[numStrings.length - 1].equals("0")) return "0";
        
        for (String str: numStrings) 
            result = str + result;
        
        return result;
    }
}
