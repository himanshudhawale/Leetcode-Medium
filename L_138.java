/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        Node temp = head; 
        
        while(temp!=null)
        {
            Node x = new Node(temp.val);
            x.next = temp.next;
            temp.next = x;
            temp = x.next;
        }
        
        temp = head; 
        
        while(temp!=null)
        {
            temp.next.random = temp.random!=null ? temp.random.next : null;
            temp = temp.next.next;
        }
        Node h = head.next;
        Node old = head;
        Node neww = head.next; 
        
        while(old!=null)
        {
            old.next = old.next.next;
            neww.next = neww.next != null ? neww.next.next : null;
            
            
            old = old.next;
            neww = neww.next;
        }
        return h;
    }
}