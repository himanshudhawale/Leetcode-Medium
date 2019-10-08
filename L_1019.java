/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head; 
        int length=0; 
        while(temp!=null)
        {
            length++;
            temp = temp.next;
        }
        int[] a = new int[length];
        int[] ans = new int[length]; 
        temp =head; 
        for(int i =0 ; i < length; i++)
        {
            a[i] = temp.val; 
            temp = temp.next;
        }
        
        for(int j=length - 1 ; j>0 ; j--)
        {
            for(int i=j-1; i>=0;i--)
            {
                if(a[j]>a[i])
                    ans[i] =a[j];
                else break;
                
            }
        }
        return ans; 
    }
}