class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) return false;
        
        int index = 0;
        while (index < A.length - 1 && A[index] < A[index + 1])
            index++;
        if (index == 0 || index == A.length - 1) return false;
        
        while (index < A.length - 1 && A[index] > A[index + 1])
            index++;
        if (index != A.length - 1) return false;
        
        return true;
    }
}
