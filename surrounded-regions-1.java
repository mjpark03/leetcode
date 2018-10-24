class Solution {
    public void solve(char[][] board) {
        if (board.length == 0)
            return;
        
        int n = board.length, m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O' && !visited[i][0])
                dfs(board, visited, i, 0, n, m);
            if (board[i][m-1] == 'O' && !visited[i][m-1])
                dfs(board, visited, i, m-1, n, m);
        }
        
        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O' && !visited[0][j])
                dfs(board, visited, 0, j, n, m);
            if (board[n-1][j] == 'O' && !visited[n-1][j])
                dfs(board, visited, n-1, j, n, m);
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O' && !visited[i][j])
                    board[i][j] = 'X';
            }
        }
    }
    
    private void dfs(char[][] board, boolean[][] visited, int i, int j, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m || visited[i][j] || board[i][j] == 'X')
            return;
        
        visited[i][j] = true;
        dfs(board, visited, i + 1, j, n, m);
        dfs(board, visited, i - 1, j, n, m);
        dfs(board, visited, i, j + 1, n, m);
        dfs(board, visited, i, j - 1, n, m);
    }
}
