class Solution {
  private static int ALPHABET_COUNT = 26;

  public List<Integer> findAnagrams(String s, String p) {

    List<Integer> result = new ArrayList<Integer>();
    int[] alphabetCount = new int[ALPHABET_COUNT];

    for (char ch: p.toCharArray())
      alphabetCount[ch - 'a']++;

    int left = 0, right = 0, count = p.length();

    while (right < s.length()) {
      char rightCh = s.charAt(right);
      if (alphabetCount[rightCh - 'a'] >= 1)
        count--;

      alphabetCount[rightCh - 'a']--;
      right++;

      if (count == 0) result.add(left);

      if (right - left == p.length()) {
        char leftCh = s.charAt(left);
        if (alphabetCount[leftCh - 'a'] >= 0) count++;
        alphabetCount[leftCh - 'a']++;
        left++;
      }
    }

    return result;
  }
}