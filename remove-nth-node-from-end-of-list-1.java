/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
       ListNode first = head;
       for (int i=0; i<n && first!=null; i++) {
           first = first.next;
       }
       if (first==null) {
           return head.next;
       }
       
       ListNode second = head;
       while (first.next!=null) {
           second = second.next;
           first = first.next;
       }
       second.next = second.next.next;
       
       return head;
    }
}
