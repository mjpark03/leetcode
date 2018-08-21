class Solution {
  public String longestPalindrome(String s) {

    String longestStr = "";
    int longestLength = 0;

    for (int i = 0; i < s.length(); i++) {
      for (int j = i+longestLength; j < s.length(); j++) {
        String subString = s.substring(i, j+1);

        if (isPalindrome(subString)) {
          if (subString.length() > longestLength) {
            longestLength = subString.length();
            longestStr = subString;
          }
        }
      }
    }

    return longestStr;
  }

  private boolean isPalindrome(String s) {
    for (int i = 0; i < s.length() / 2; i++) {
      if (!(s.charAt(i) == s.charAt(s.length() - 1 - i))) {
        return false;
      }
    }
    return true;
  }
}