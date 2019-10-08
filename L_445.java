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
        ListNode reverse_l1 = l1;
        reverse_l1 = reverseList(l1);  
        ListNode reverse_l2 = l2;
        reverse_l2 = reverseList(l2);
        ListNode head = new ListNode(-1);
        ListNode result= head;
        int carry=0;
        while(reverse_l1!=null || reverse_l2!=null)
        {
            int sum = carry;
            if(reverse_l1!=null)
            {
                sum = sum + reverse_l1.val;
                reverse_l1 = reverse_l1.next; 
            }
            if(reverse_l2!=null)
            {
                sum=sum+reverse_l2.val;
                reverse_l2 = reverse_l2.next; 
            }
            int mod = sum%10; 
            carry = sum/10; 
            
            ListNode x = new ListNode(mod);
            result.next = x; 
            result =result.next; 
            
        }
        if(carry>0)
        {
            ListNode x = new ListNode(carry);
            result.next = x; 
        }
        
        

        // System.out.println(result.next.next.val);
        
        head = reverseList(head.next);
        
        return head;
        
    }
    
    public ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null)
        {
            ListNode temp = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = temp;
        }
        return prev; 
    }
}