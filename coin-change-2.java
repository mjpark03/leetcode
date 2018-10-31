public class Solution {
    
    public int coinChange(int[] coins, int amount) {
        int[] count = new int[amount + 1];
        
        for (int i = 1; i <= amount; i++) {
            count[i] = Integer.MAX_VALUE;
            
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i && count[i - coins[j]] != Integer.MAX_VALUE) {
                    count[i] = Math.min(count[i], count[i - coins[j]] + 1);
                }
            }
        }
        
        return count[amount] != Integer.MAX_VALUE ? count[amount] : -1;
    }
}
