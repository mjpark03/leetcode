class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (numRows == 0)
            return result;
        
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        
        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            List<Integer> prevRow = result.get(i-1);
            
            newRow.add(1);
            for (int index = 1; index < i; index++) {
                newRow.add(prevRow.get(index-1) + prevRow.get(index));
            }
            newRow.add(1);
            
            result.add(newRow);
        }
        
        return result;
    }
}
