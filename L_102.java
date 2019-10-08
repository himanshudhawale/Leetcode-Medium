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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); 
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> mylist = new ArrayList<>();
            for(int i=0; i<size;i++)
            {
                TreeNode curr = queue.poll();
                mylist.add(curr.val);
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
                
            }
            list.add(mylist);    
        }
        return list;
    }
}