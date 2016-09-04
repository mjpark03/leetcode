public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++) {
            int key = nums[i];
            
            if(map.containsKey(key)) {
                int index = map.get(key);
                if(i-index <= k) return true;
            } 
                
            map.put(key, i);
        }
        
        return false;
    }
i}
