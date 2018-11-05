class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0  || matrix[0].length == 0) return false;
        
        int begin = 0, end = matrix.length * matrix[0].length - 1;
        
        while (begin <= end) {
            int mid = (begin + end) / 2;
            int row = mid / matrix[0].length, col = mid % matrix[0].length;
            
            if (target == matrix[row][col]) return true;
            else if (target < matrix[row][col]) end = mid - 1;
            else begin = mid + 1;
        }
        
        return false;
    }
}
