class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] checkSubs = new boolean[s.length() + 1];
        checkSubs[0] = true;
        
        for (int end = 1; end <= s.length(); end++) {
            for (int start = 0; start < end; start++) {
                if (checkSubs[start] && wordDict.contains(s.substring(start, end))) {
                    checkSubs[end] = true;
                    break;
                }
            }
        }
        
        return checkSubs[s.length()];
    }
}
