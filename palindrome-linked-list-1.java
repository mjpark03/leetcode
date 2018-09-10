/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode left;
    
    public boolean isPalindrome(ListNode head) {
        left = head;
        return checkPalindrome(head);
    }
    
    private boolean checkPalindrome(ListNode right) {
        if (right == null)
            return true;
        
        boolean check = checkPalindrome(right.next);
        if (!check)
            return false;
        
        boolean isSame = left.val == right.val;
        left = left.next;
        
        return isSame;
    }
}
