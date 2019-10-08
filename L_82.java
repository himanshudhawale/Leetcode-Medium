/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(-1);
        // dummy.next=head;
        ListNode temp = dummy;
        
        while(head!=null)
        {
            if(head.next==null || head.next.val != head.val)
            {
                dummy.next = head; 
                dummy= dummy.next;
                head= head.next;
            }else{
                 int val = head.val; 
                while(head!=null && head.val==val)
                {  head=head.next;
                }
            }
        }
        dummy.next=null;
        return temp.next;
    }
}