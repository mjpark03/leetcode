class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        for (int i = 0; i < numbers.length-1; i++) {
            int first = numbers[i];
            
            for (int j = i+1; j < numbers.length; j++) {
                int second = numbers[j];
                if (target - first == second) {
                    return new int[]{i+1, j+1};
                } else if (target - first < second) {
                    break;
                }
            }
        }
        
        return null;
    }
}
