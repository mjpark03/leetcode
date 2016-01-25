/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode resultHead;
        ListNode resultTrack;
        ListNode track = head;
        
        if (head==null || track.next==null) {
            return head;
        }
        
        int lastVal = track.val;
        int currentVal = track.val;
        resultHead = new ListNode(currentVal);
        track = track.next;
        resultTrack = resultHead;
        
        while(track!=null) {
            currentVal = track.val;
            
            if (lastVal!=currentVal) {
                resultTrack.next = new ListNode(currentVal);
                resultTrack = resultTrack.next;
                lastVal = currentVal;
            } 
            
            track = track.next;
        }
        
        return resultHead;
    }
}
