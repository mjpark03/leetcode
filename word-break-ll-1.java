class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<Integer, List<String>> subs = new HashMap<>();
        
        int maxSize = Integer.MIN_VALUE;
        for (String word: wordDict) maxSize = Math.max(maxSize, word.length());
        return getSubs(subs, s, wordDict, 0, maxSize);
    }
    
    private List<String> getSubs(Map<Integer, List<String>> subs, String s, List<String> wordDict,
                                int start, int maxSize) {
        List<String> words = new ArrayList<>();
        
        if (start == s.length()) {
            words.add("");
            return words;
        }
        
        for (int end = start + 1; end <= maxSize + start && end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (wordDict.contains(word)) {
                List<String> list;
                
                if (subs.containsKey(end)) list = subs.get(end);
                else list = getSubs(subs, s, wordDict, end, maxSize);
                
                for (String sub: list) words.add(word + (sub.equals("") ? "" : " ") + sub);
            }
        }
        
        subs.put(start, words);
        return words;
    }
}
