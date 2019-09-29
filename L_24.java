/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode temphead = new ListNode(0), curr = temphead;
        temphead.next = head;
        while(curr != null && curr.next != null){
            curr = myfunction(curr);
        }
	    return temphead.next;
    }
    
    public ListNode myfunction(ListNode curr)
    {
        ListNode a = curr.next;
        if(a.next == null) 
            return a;
        ListNode b = a.next;
        a.next = b.next;
        b.next = curr.next;
	    curr.next = b;

	return a;
    }
}