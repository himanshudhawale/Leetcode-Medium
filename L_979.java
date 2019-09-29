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
    int count;
    public int distributeCoins(TreeNode root) {
        count=0;
        myfunction(root);
        return count;
    }
    public int myfunction(TreeNode node)
    {
        if(node == null) 
            return 0;
        int left = myfunction(node.left);
        int right = myfunction(node.right);
        count = count+ Math.abs(left) + Math.abs(right);
        return node.val+left+right;
    }
}