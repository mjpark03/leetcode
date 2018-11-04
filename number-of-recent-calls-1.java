class RecentCounter {
    
    int[] times;
    int index;

    public RecentCounter() {
        times = new int[10000];
        index = 0;
    }
    
    public int ping(int t) {
        times[index++] = t;
        
        int count = 0;
        for (int i = index - 1; i >= 0; i--)
            if (times[i] >= (t - 3000))
                count++;
            else
                break;
        
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
