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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        {
            return null;
        }
        if(root.val==p.val || root.val==q.val)
        {
            return root;
        }
        if((root.val<p.val && root.val>q.val) ||(root.val>p.val && root.val<q.val))
        {
            return root;
        }
        if(root.val<p.val && root.val<q.val)
        {
           TreeNode res= lowestCommonAncestor(root.right,p,q);
           if(res!=null)
           {
            return res;
           }
        }
        else{
            TreeNode res=lowestCommonAncestor(root.left,p,q);
            if(res!=null)
            {
                return res;
            }
        }
        return null;
    }
}
