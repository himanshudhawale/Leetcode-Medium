/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode plusOne(ListNode head) {
        ListNode reverse_head= head;
        reverse_head = reverse(reverse_head);
 
        ListNode temp=reverse_head;
 
        while(temp!=null){
            if(temp.val+1<=9){
                temp.val=temp.val+1;
                break;
            }
            else{
                temp.val=0;
                if(temp.next==null){
                    temp.next = new ListNode(1);
                    break;
                }
                temp=temp.next;
            }
        }

    return reverse(reverse_head);
}
 
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        while(current!=null){
            ListNode temp = current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }   
        return prev;
    }
}