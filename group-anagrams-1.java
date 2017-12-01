class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        List<List<String>> result = new ArrayList<List<String>>();
        
        for (String str: strs) {
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sortedStr = new String(strArray);
            
            ArrayList<String> list;
            if (map.containsKey(sortedStr))
                list = map.get(sortedStr);
            else
                list = new ArrayList<String>();
            
            list.add(str);
            map.put(sortedStr, list);
        }
        
        for (ArrayList<String> list: map.values())
            result.add(list);
        
        return result;
    }
}