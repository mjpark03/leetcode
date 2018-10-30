class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums)
            set.add(num);
        
        int longest = 0;
        for (int num: nums) {
            int size = 1;
            
            if (set.contains(num)) {
                int nextNum = num - 1;
                while (set.contains(nextNum)) {
                    size++;
                    set.remove(nextNum--);
                }
                
                nextNum = num + 1;
                while (set.contains(nextNum)) {
                    size++;
                    set.remove(nextNum++);
                }
                
                longest = Math.max(longest, size);
            }
        }
        
        return longest;
    }
}
