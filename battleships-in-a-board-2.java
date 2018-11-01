class Solution {
    public int countBattleships(char[][] board) {
        int rows = board.length, cols = board[0].length;
        int count = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'X') {
                    dfsRow(board, i, j, rows, cols);
                    board[i][j] = 'X';
                    dfsCol(board, i, j, rows, cols);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private void dfsRow(char[][] board, int i, int j, int rows, int cols) {
        if (i >= rows || j >= cols || board[i][j] == '.') return;
        
        board[i][j] = '.';
        dfsRow(board, i+1, j, rows, cols);
    }
    
    private void dfsCol(char[][] board, int i, int j, int rows, int cols) {
        if (i >= rows || j >= cols || board[i][j] == '.') return;
        
        board[i][j] = '.';
        dfsCol(board, i, j+1, rows, cols);
    }

}
