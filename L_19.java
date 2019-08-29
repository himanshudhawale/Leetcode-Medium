/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=n; 
    
        ListNode well = new ListNode(-1);
        well.next=head;
        ListNode cur = well; 
        ListNode temp = well; 
        // if(head.next==null && n==1)
        //     return null;
        // if(head.next.next == null && n==2)
        //     return head.next;
        // if(n==4 && head.next.next.next == null)
        //     return head.next.next;
        while(i>=0)
        {
            i--;
            temp=temp.next;
        }
        while(temp!=null)
        {
            temp = temp.next;
            // prev = cur;
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return well.next;
        
    }
}