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
    public int sumNumbers(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return 0;
        Queue<Integer> sum = new LinkedList<>();
        q.offer(root);
        sum.offer(root.val);
        int ans=0;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size; i++)
            {
                TreeNode curr = q.poll();
                int temp = sum.poll();
                if(curr.left!=null){
                    q.offer(curr.left);
                    sum.offer(temp*10 + curr.left.val);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                    sum.offer(temp*10 + curr.right.val);
                }
                if(curr.left == null && curr.right == null)
                    ans+=temp;
                
            }
            
        }
        return ans;
    }
}