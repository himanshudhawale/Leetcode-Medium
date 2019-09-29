/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1; 
        ListNode n2 = l2; 
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        int carry = 0; 
        while(n1!=null || n2!=null)
        {
            int sum=0;
            if(n1!=null)
            {
                sum = sum+n1.val;
                n1=n1.next;
            }
            if(n2!=null)
            {
                sum=sum+n2.val;
                n2=n2.next;
            }
            sum=sum+carry;
            int mod = sum%10;
            carry = sum/10;
            
            
            ListNode x = new ListNode(mod);
            temp.next = x;
            temp = temp.next;
        }
        
        if(carry>0)
        {
            ListNode x = new ListNode(carry);
            temp.next = x; 
        }
        
        return head.next;
        
    }
}