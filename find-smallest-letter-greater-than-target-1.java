class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        for (int index = 0; index < letters.length; index++) 
            if (letters[index] > target) return letters[index];
        
        return letters[0];
    }
}