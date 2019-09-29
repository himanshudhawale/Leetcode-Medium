/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        
        if(root==null)
        {
            return root; 
        }
        
        Queue<Node> queue=new LinkedList<>();
    
        queue.offer(root);
        
    
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            Node currentNode, nextNode;
            
            for(int i=0;i<size;i++)
            {
                currentNode = queue.poll();
                
                if(i<size-1)
                {
                    nextNode = queue.peek();
                    currentNode.next = nextNode;
                }
                
                if(currentNode.left!=null)
                    queue.offer(currentNode.left);
                if(currentNode.right!=null)
                    queue.offer(currentNode.right);
            }
        }
        return root;
    }
}

//recursion
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        
        if(root==null)
        {
            return root; 
        }
        
        if(root.left!=null)
            root.left.next = root.right;
        
        if(root.right!=null)
            root.right.next = (root.next!=null) ? root.next.left : null;
        
        connect(root.left);
        connect(root.right);
        
        return root;
    }
}