class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int p1 = 0, p2 = 0;
        List<Integer> intersection = new ArrayList<>();
        
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else {
                intersection.add(nums1[p1]);
                p1++;
                p2++;
            }
        }  
        
        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num: intersection)
            result[index++] = num;
     
        return result;
    }
}
