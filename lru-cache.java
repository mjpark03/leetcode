import java.util.*;;

public class LRUCache {
    
    private final int capacity;
    private HashMap lruCache;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.lruCache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > LRUCache.this.capacity;
        }
      };
    }
    
    public int get(int key) {
        if (lruCache.containsKey(key)) {
            return (Integer)lruCache.get(key);
        } else {
            return -1;
        }
    }
    
    public void set(int key, int value) {
       lruCache.put(key, value);
    }
}
