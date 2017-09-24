
class Solution {
    public int change(int amount, int[] coins) {
        
        int[] count = new int[amount+1];
        count[0] = 1;
        
        for (int i=0; i<coins.length; i++) {
            for (int j=coins[i]; j<=amount; j++) {
                count[j] = count[j] + count[j - coins[i]];
            }
        }
        
        return count[amount];
    }
}