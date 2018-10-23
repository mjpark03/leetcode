class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> results = new ArrayList<>();
        int[] indexes = new int[26];
        
        for (int i = 0; i < S.length(); i++)
            indexes[S.charAt(i) - 'a'] = i;
        
        int start = 0, end = 0;
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, indexes[S.charAt(i) - 'a']);
            
            if (end == i) {
                results.add(end - start + 1);
                start = end + 1;
            }
        }
        
        return results;
    }
}
