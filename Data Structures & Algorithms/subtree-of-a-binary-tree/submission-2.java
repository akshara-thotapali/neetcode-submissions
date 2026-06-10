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
    public boolean checkTrees(TreeNode h1,TreeNode h2)
    {
         if(h1==null && h2==null)
        {
            return true;
        }
        if(h1==null || h2==null)
        {
            return false;
        }
        if(h1.val!=h2.val)
        {
            return false;
        }
        return checkTrees(h1.left,h2.left) && checkTrees(h1.right,h2.right);
    }
    public boolean findRoot(TreeNode root,TreeNode subRoot)
    {
        if(root==null)
        {
            return false;
        }
        if(root.val==subRoot.val)
        {
            if(checkTrees(root,subRoot))
            {
                return true;
            }
        }
            if(findRoot(root.left,subRoot))
            {
                return true;
            }
           if(findRoot(root.right,subRoot))
           {
            return true;
           }
        return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)
        {
            if(subRoot==null)
            {
                return true;
            }
            return false;
        }
         return findRoot(root,subRoot);
    }
}
