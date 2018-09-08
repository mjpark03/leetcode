class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        
        for (int i = 1; i <= rowIndex; i++) {
            result.add(1);
            
            for (int j = i-1; j >= 1; j--) {
                result.set(j, result.get(j) + result.get(j-1));
            }
        }
        
        return result;
    }
}
