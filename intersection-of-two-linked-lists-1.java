/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0, sizeB = 0;
        ListNode pA = headA, pB = headB;
        
        while (pA != null) {
            sizeA++;
            pA = pA.next;
        }
        while (pB != null) {
            sizeB++;
            pB = pB.next;
        }
        
        if (sizeA - sizeB > 0) {
            for (int i = 0; i < sizeA - sizeB; i++)
                headA = headA.next;
        } else {
            for (int i = 0; i < sizeB - sizeA; i++)
                headB = headB.next;
        }
        
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
}
