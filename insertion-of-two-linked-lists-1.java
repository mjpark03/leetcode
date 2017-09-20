public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if (headA == null || headB == null) return null;
        
        HashSet<ListNode> set = new HashSet<>();
        ListNode node = headA;
        
        while (node != null) {
            set.add(node);
            node = node.next;
        }
        
        node = headB;
        boolean intersection = false;
        
        while (node != null) {
            if (set.contains(node)) {
                intersection = true;
                break;
            }
            
            node = node.next;
        }
        
        if (intersection) return node;
        else return null;
    }
}