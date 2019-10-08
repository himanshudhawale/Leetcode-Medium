/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
            return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode curr = slow.next;
        ListNode prev=null;
        slow.next=null;
        
        while(curr!=null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }
        
        while(prev!=null)
        {
            ListNode temp = prev.next;
            prev.next = head.next;
            head.next = prev;
            prev = temp;
            head = head.next.next;
        }
         
    }
}