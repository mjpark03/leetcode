class Solution {
    public int shortestBridge(int[][] A) {
        int rows = A.length, cols = A[0].length;
        Queue<int[]> secondIsland = new LinkedList<>();
        boolean foundFirst = false;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!foundFirst && A[i][j] == 1) {
                    findFirst(A, i, j, rows, cols);
                    foundFirst = true;
                }
                
                if (foundFirst && A[i][j] == 1) 
                    secondIsland.add(new int[]{i,j});
            }
        }
        
        int[][] direction = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        int count = 0;
        
        while (!secondIsland.isEmpty()) {
            int size = secondIsland.size();
            for (int s = 0; s < size; s++) {
                int[] position = secondIsland.poll();
                
                for (int i = 0; i < direction.length; i++) {
                    int x = position[0] + direction[i][0];
                    int y = position[1] + direction[i][1];
                    
                    if (x < 0 || x >= rows || y < 0 || y >= cols || A[x][y] == 1) continue;
                    
                    if (A[x][y] == 2) return count;
                    else {
                        A[x][y] = 1;
                        secondIsland.add(new int[]{x,y});
                    }
                }
            }
            
            count++;
        }
        
        return -1;
    }
    
    private void findFirst(int[][] A, int i, int j, int rows, int cols) {
        A[i][j] = 2;
        if (i+1 < rows && A[i+1][j] == 1) findFirst(A, i+1, j, rows, cols);
        if (i-1 >= 0 && A[i-1][j] == 1) findFirst(A, i-1, j, rows, cols);
        if (j+1 < cols && A[i][j+1] == 1) findFirst(A, i, j+1, rows, cols);
        if (j-1 >= 0 && A[i][j-1] == 1) findFirst(A, i, j-1, rows, cols);
    }
}
