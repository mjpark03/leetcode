class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int first = (m + n + 1) / 2, second = (m + n + 2) / 2;
        
        return (getMedian(nums1, 0, nums2, 0, first) + getMedian(nums1, 0, nums2, 0, second)) / 2.0;
    }
    
    private double getMedian(int[] nums1, int start1, int[] nums2, int start2, int index) {
        if (start1 > nums1.length - 1) return nums2[start2 + index - 1];
        if (start2 > nums2.length - 1) return nums1[start1 + index - 1];
        if (index == 1) return Math.min(nums1[start1], nums2[start2]);
        
        int mid1 = Integer.MAX_VALUE, mid2 = Integer.MAX_VALUE;
        if (start1 + index/2 - 1 < nums1.length) mid1 = nums1[start1 + index/2 - 1];
        if (start2 + index/2 - 1 < nums2.length) mid2 = nums2[start2 + index/2 - 1];
        
        if (mid1 < mid2)
            return getMedian(nums1, start1 + index/2, nums2, start2, index - index/2);
        else
            return getMedian(nums1, start1, nums2, start2 + index/2, index - index/2);
    }
}
