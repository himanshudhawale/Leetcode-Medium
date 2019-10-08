/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n)
            return head;
        
        ListNode prev = null; 
        ListNode slow = new ListNode(-1);
        ListNode fast = new ListNode(-1); 
        int len=0;
        ListNode temp = head;
        while(temp!=null)
        {
            len++; 
            if(len==m-1)
                prev= temp; 
            
            if(len==m)
                slow.next = temp; 
            
            if(len==n){
                fast.next=temp.next;
                temp.next=null;
            }
            temp = temp.next; 
        }
      
    
    ListNode new_prev = slow.next;
    ListNode new_curr = new_prev.next;
    new_prev.next = fast.next;
 
    while(new_prev!=null && new_curr!=null){
        ListNode temp1 = new_curr.next;
        new_curr.next = new_prev;
        new_prev = new_curr;
        new_curr = temp1;
    }
 
    if(prev!=null)
        prev.next = new_prev;
    else
        return new_prev;
 
    return head;
    }
    
}