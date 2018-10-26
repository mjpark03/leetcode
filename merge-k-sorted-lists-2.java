/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        
        PriorityQueue<ListNode> q = new PriorityQueue<>(lists.length, (node1, node2) -> node1.val - node2.val);
        ListNode fake = new ListNode(0);
        ListNode tail = fake;
        
        for (ListNode node: lists)
            if (node != null)
                q.add(node);
        
        while (!q.isEmpty()) {
            tail.next = q.poll();
            tail = tail.next;
            
            if (tail.next != null)
                q.add(tail.next);
        }
        
        return fake.next;
    }
}
