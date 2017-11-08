class Solution {
  public int minSubArrayLen(int s, int[] nums) {

    int left = 0, right = 0, min = Integer.MAX_VALUE, sum = 0;

    while (right < nums.length) {
      int rightNum = nums[right];
      if (rightNum + sum < s) {
        sum += rightNum;
        right++;
      } else {
        int leftNum = nums[left];
        min = Math.min(min, right - left + 1);
        sum -= leftNum;
        left++;
      }
    }

    return min == Integer.MAX_VALUE ? 0 : min;
  }
}