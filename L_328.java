/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return head; 
        ListNode odd = head; 
        ListNode even = head.next, temp = even; 
        while(even!=null && even.next!=null)
        {
            odd.next = even.next;
            odd= odd.next; 
            even.next = odd.next; 
            even = even.next; 
        }
        odd.next =temp;
        return head; 
    }
}