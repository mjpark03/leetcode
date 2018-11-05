class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        
        boolean goLeft = false;
        int row = 0, col = matrix[0].length - 1;
        
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (target < matrix[row][col]) {
                col--;
                goLeft = true;
            } else {
                if (goLeft) return false;
                row++;
            }
        }
        
        return false;
    }
}
