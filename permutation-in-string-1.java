class Solution {
  private static int CHARACTER_COUNT = 26;

  public boolean checkInclusion(String s1, String s2) {

    int[] characterCount = new int[CHARACTER_COUNT];

    for (char ch: s1.toCharArray())
      characterCount[ch - 'a']++;

    int left = 0, right = 0, count = s1.length();

    while (right < s2.length()) {
      char rightCh = s2.charAt(right);

      if (characterCount[rightCh - 'a'] >= 1)
        count--;

      right++;
      characterCount[rightCh - 'a']--;

      if (count == 0) return true;

      if (right - left == s1.length()) {
        char leftCh = s2.charAt(left);
        if (characterCount[leftCh - 'a'] >= 0)
          count++;
        left++;
        characterCount[leftCh - 'a']++;
      }
    }

    return false;
  }
}