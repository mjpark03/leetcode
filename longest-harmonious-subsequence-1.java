import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Solution {
    public int findLHS(int[] nums) {

    	Map<Integer, Integer> unsortedCountMap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int key = nums[i];
            int value = unsortedCountMap.get(key) == null ? 0 : unsortedCountMap.get(key);
            unsortedCountMap.put(key, value + 1);
        }
        
        Map<Integer, Integer> sortedCountMap = new TreeMap<>(unsortedCountMap);
        int max = 0;
        int pKey = 0, pValue = 0;
        int cKey = 0, cValue = 0;
        int index = 0;
        
        if(sortedCountMap.size() == 1) return max;

        Iterator<Integer> keys = sortedCountMap.keySet().iterator();
        while(keys.hasNext()) {
            index++;
            cKey = keys.next();
            cValue = sortedCountMap.get(cKey);

            if (index == 1) {
                pKey = cKey;
                pValue = cValue;
                continue;
            }
            
            if(Math.abs((cKey - pKey)) == 1) {
                if((cValue + pValue) > max)
                    max = cValue + pValue;
            }

            pKey = cKey;
            pValue = cValue;
        }

        return max;
    }
}