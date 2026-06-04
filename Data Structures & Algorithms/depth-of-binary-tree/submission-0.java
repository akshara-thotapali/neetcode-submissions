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
    int maxi=1;
    public void depthCalcu(TreeNode root,int d)
    {
        if(root==null)
        {
            return;
        }
         maxi=Math.max(maxi,d);
         depthCalcu(root.left,d+1);
         depthCalcu(root.right,d+1);
         return;
    }
    public int maxDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        depthCalcu(root,1);
        return maxi;
    }
}
