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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack<>();
        HashMap<TreeNode, TreeNode> map = new HashMap<>();
        stack.push(root);
        map.put(root,null);
        
        while(!map.containsKey(p) || !map.containsKey(q))
        {
            if(root.left!=null)
            {
                map.put(root.left,root);
                stack.push(root.left);
            }
            if(root.right!=null)
            {
                map.put(root.right,root);
                stack.push(root.right);
            }  
            root= stack.pop();
        }
        
        Set<TreeNode> set = new HashSet<>();
        
        while(p!=null)
        {
            set.add(p);
            p = map.get(p);
            
        }
        //p -->parent
        while(!set.contains(q))
        {
            q=map.get(q);
        }
        
        return q;
        
    }
}