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
    public void inorderTraversal(ArrayList<Integer> list,TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorderTraversal(list,root.left);
        list.add(root.val);
        inorderTraversal(list,root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
     ArrayList<Integer> list=new ArrayList<>();
     inorderTraversal(list,root);
     return list.get(k-1);   
    }
}
