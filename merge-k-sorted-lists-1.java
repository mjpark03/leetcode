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
        return partitionAndSort(lists, 0, lists.length - 1);
    }
    
    private ListNode partitionAndSort(ListNode[] lists, int start, int end) {
        if (start == end) return lists[start];
        
        if (start < end) {
            int middle = (start + end) / 2;
            ListNode list1 = partitionAndSort(lists, start, middle);
            ListNode list2 = partitionAndSort(lists, middle + 1, end);
            return merge(list1, list2);
        } else {
            return null;
        }
    }
    
    private ListNode merge(ListNode node1, ListNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        
        if (node1.val < node2.val) {
            node1.next = merge(node1.next, node2);
            return node1;
        } else {
            node2.next = merge(node1, node2.next);
            return node2;
        }
    }
}
