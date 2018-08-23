/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode mergedList = new ListNode(0);
        
        ListNode point = mergedList;
        ListNode point1 = l1;
        ListNode point2 = l2;
        
        while (point1 != null && point2 != null) {
            if (point1.val < point2.val) {
                point.next = point1;
                point1 = point1.next;
            } else {
                point.next = point2;
                point2 = point2.next;
            }
            
            point = point.next;
        }
        
        if (point1 != null)
            point.next = point1;
        if (point2 != null)
            point.next = point2;
        
        return mergedList.next;
    }
}
