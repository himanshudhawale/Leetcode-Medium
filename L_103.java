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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;


        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        boolean flag= true;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> mylist = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode current = queue.poll();
                if(current.left!=null)
                    queue.offer(current.left);
                if(current.right!=null )
                    queue.offer(current.right);
                if(flag)
                {
                    mylist.add(current.val);
                }else{
                    mylist.add(0,current.val);
                }
                
            }
            result.add(mylist); 
            flag = !flag;
        }
        
        return result;
    }
}