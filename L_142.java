/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 //O(n) space 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // ListNode temp = head;
        Set<ListNode> myset = new HashSet<ListNode>();
        if(head == null || head.next == null )
            return null;
        
        while(head!=null)
        {
            if(myset.contains(head))
                return head;
            else
            {
                myset.add(head);
            }
            head = head.next;
        }
        return null;
    }
}

//O(1) space
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null )
            return null;
        
        ListNode one = head;
        ListNode two = head;
        ListNode result = null;
        
        while(two!=null && two.next!=null)
        {
            one =one.next;
            two = two.next.next;
            if(one == two)
            {
              result = one;
              break; 
            }
        }
        
        if (result == null) {
            return null;
        }

        ListNode ptr1 = head;
        ListNode ptr2 = result;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }
}