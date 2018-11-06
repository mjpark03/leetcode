class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0, index2 = 0;
        
        Set<Integer> resultSet = new HashSet<>();
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] < nums2[index2]) index1++;
            else if (nums1[index1] > nums2[index2]) index2++;
            else {
                resultSet.add(nums1[index1]);
                index1++;
                index2++;
            }
        }
        
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num: resultSet)
            result[index++] = num;
        
        return result;
    }
}
