public class Solution {
    
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        
        int[] amountArr = new int[amount+1];
        for(int i=1; i<amountArr.length; i++) {
            amountArr[i] = -1;
        }
        
        for(int i=1; i<amountArr.length; i++) {
            for(int j=0; j<coins.length; j++) {
                
                if(coins[j] <= i) {
                    int prevAmount = amountArr[i-coins[j]];
                    
                    if(prevAmount != -1 && (amountArr[i] == -1 || prevAmount+1 < amountArr[i])) {
                        amountArr[i] = prevAmount + 1;
                    }
                }
            }
        }
        
        return amountArr[amount];
    }
}
