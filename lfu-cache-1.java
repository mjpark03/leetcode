import java.util.HashMap; 
import java.util.LinkedHashSet;


public class Solution {
    HashMap<Integer, Integer> map;
    HashMap<Integer, Integer> countMap;
    HashMap<Integer, LinkedHashSet<Integer>> orderMap;

    int capacity;
    int min = -1;

    public LFUCache(int capacity) {
        this.capacity = capacity;

        map = new HashMap<>();
        countMap = new HashMap<>();
        orderMap = new HashMap<>();
        orderMap.put(1, new LinkedHashSet<>());
    }
    
    public int get(int key) {

        if(!map.containsKey(key))
            return -1;

        int count = countMap.get(key);
        countMap.put(key, count + 1);

        orderMap.get(count).remove(key);
        if(count == min && orderMap.get(count).size() == 0)
            min = min + 1;

        if(!orderMap.containsKey(count + 1))
            orderMap.put(count + 1, new LinkedHashSet<>());

        orderMap.get(count + 1).add(key);

        return map.get(key);
    }
    
    public void put(int key, int value) {
        if (capacity <= 0)
            return;

        if(map.containsKey(key)) {
            map.put(key, value);
            get(key);
            return;
        } 

        if(map.size() >= capacity) {
            int removedKey = orderMap.get(min).iterator().next();
            orderMap.get(min).remove(removedKey);
            map.remove(removedKey);
        }

        map.put(key, value);
        countMap.put(key, 1);
        min = 1;
        orderMap.get(1).add(key);
    }
}
