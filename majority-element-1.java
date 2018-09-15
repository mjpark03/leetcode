class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> check = new HashMap<>();
        int result = 0;
        
        for (int num: nums) {
            int count = check.containsKey(num) ? check.get(num) + 1 : 1;
            check.put(num, count);
        }
        
        for (Map.Entry<Integer, Integer> entry: check.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                result = entry.getKey();
                break;
            }
        }
        
        return result;
    }
}
