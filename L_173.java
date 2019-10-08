/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        pushToStack(root);
    }
    
    private void pushToStack(TreeNode node) {
        while (node != null) {
            stack.add(node); 
            node = node.left;
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        if (!hasNext()) return -1;
        TreeNode node = stack.pop();
        pushToStack(node.right);
        return node.val;

    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */