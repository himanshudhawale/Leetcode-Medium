/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Queue<TreeNode> queue = new LinkedList<>();
    Queue<Integer> lowQueue = new LinkedList<>();
    Queue<Integer> endQueue = new LinkedList<>();

    public boolean isValidBST(TreeNode root) {
        // queue.offer(root);
        int val=0;
        Integer low= null;
        Integer end= null;
        myfunction(root,low,end);

        while(!queue.isEmpty())
        {
            root = queue.poll();
            low=lowQueue.poll();
            end=endQueue.poll();
            
            if(root==null)
                continue;
            val = root.val;
            if(low!=null && val <= low )
                return false;
            if(end!=null && val >= end)
                return false;
            
            myfunction(root.left,low,val);
            myfunction(root.right,val,end);    
            
        }
        return true;
    }
    
    public void myfunction(TreeNode node, Integer low, Integer end)
    {
        queue.offer(node);
        lowQueue.offer(low);
        endQueue.offer(end);
    }
    
}

//Recursion
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public boolean isValidBST(TreeNode root) {
        return myfunction(root, null, null);
    }
    
    public boolean myfunction(TreeNode t, Integer low, Integer end)
    {
        if(t==null)
            return true;
        int val=t.val;
        if(low!=null && val<=low)
            return false;
        if(end!=null && val>=end)
            return false;
        if(! myfunction(t.left, low, val))
            return false;
        if(! (myfunction(t.right,val,end)))
            return false;
        return true;
    }
    
}