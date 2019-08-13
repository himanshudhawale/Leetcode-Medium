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
    public int kthSmallest(TreeNode root, int k) {
        //if k is smaller go left else go right till key not found
        TreeNode temp=root; 
        Stack<TreeNode> s=new Stack<TreeNode>();
        int count=0;
        
        while(temp!=null)
        {
            s.push(temp);
            temp=temp.left;
        }
        
        while(!s.isEmpty())
        {
            TreeNode x=s.pop();
            count++;
            if(count==k)
            {
                return x.val; 
            }
            TreeNode temp1 = x.right;
            while(temp1!=null)
            {
                s.push(temp1);
                temp1=temp1.left;
            }
        }
        
        return -1;
    
                
    }
}