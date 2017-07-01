public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String, Integer> firstMap = new HashMap<>();
        
        for(int i=0; i<list1.length; i++) {
            firstMap.put(list1[i], i);
        }
        
        int min = -1;
        ArrayList<String> resultList = new ArrayList<>();
        
        for(int i=0; i<list2.length; i++) {
            String key = list2[i];
            
            if(firstMap.containsKey(key)) {
                int indexSum = firstMap.get(key) + i;
                if(min == -1 || min > indexSum) {
                    min = indexSum;
                    resultList = new ArrayList<>();
                    resultList.add(key);
                } else if(min == indexSum) {
                    resultList.add(key);
                }
            }
        }
        
        return resultList.toArray(new String[resultList.size()]);
    }
}
