/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxi;
    public int maxSum(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=Math.max(0,maxSum(root.left));
        int right=Math.max(0,maxSum(root.right));
        maxi=Math.max(maxi,left+right+root.val);
        return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
       maxi=Integer.MIN_VALUE;
       maxSum(root);
       if(maxi==Integer.MIN_VALUE)
       {
           return 0;
       }
       return maxi; 
    }
}
