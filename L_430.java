/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
*/
class Solution {
    public Node flatten(Node head) {
        Node curr = head;
        Stack<Node> stack = new Stack<>();
        
        while(curr != null){
            if(curr.child != null){
                stack.push(curr.next);
                curr.next = curr.child;
                curr.next.prev = curr;
                curr.child = null;
            }else if(curr.next == null && !stack.isEmpty()){
                curr.next = stack.pop();
                if(curr.next != null)
                    curr.next.prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}