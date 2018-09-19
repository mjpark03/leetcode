class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int[] copy = Arrays.copyOf(nums, size);

        for (int i = 0; i < size; i++)
            nums[(i+k) % size] = copy[i];
    }
}
