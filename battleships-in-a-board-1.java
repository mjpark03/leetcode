class Solution {
    public int countBattleships(char[][] board) {
        int rows = board.length, cols = board[0].length;
        char battleship = 'X', empty = '.';
        int count = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == empty) continue;
                if (i > 0 && board[i-1][j] == battleship) continue;
                if (j > 0 && board[i][j-1] == battleship) continue;
                count++;
            }
        }
        
        return count;
    }
}
