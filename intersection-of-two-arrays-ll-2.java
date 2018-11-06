class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Map = new HashMap<>();
        for (int num: nums1) {
            int count = nums1Map.containsKey(num) ? nums1Map.get(num) + 1 : 1;
            nums1Map.put(num, count);
        }
        
        List<Integer> resultList = new ArrayList<>();
        for (int num: nums2) {
            if (nums1Map.containsKey(num) && nums1Map.get(num) > 0) {
                resultList.add(num);
                nums1Map.put(num, nums1Map.get(num) - 1);
            }
        }
        
        int[] results = new int[resultList.size()];
        int index = 0;
        for (int num: resultList)
            results[index++] = num;
        
        return results;
    }
}
