/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int portion = 0;
        int sum = 0;
        
        sum = l1.val + l2.val;
        portion = sum / 10;
        
        ListNode result = new ListNode(sum % 10);
        ListNode pointer = result;
        
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            sum = val1 + val2 + portion;
            
            ListNode node = new ListNode(sum % 10);
            pointer.next = node;
            pointer = pointer.next;
            portion = sum / 10;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        if (portion != 0) {
            pointer.next = new ListNode(portion);
        }
        
        return result;
    }
}