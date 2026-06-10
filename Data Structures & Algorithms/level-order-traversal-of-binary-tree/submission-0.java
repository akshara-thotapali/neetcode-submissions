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
    public void helpFunction(List<List<Integer>> res,TreeNode root)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            while(size-->0){
            TreeNode num=q.poll();
                list.add(num.val);
                if(num.left!=null)
                {
                    q.add(num.left);
                }
                if(num.right!=null)
                {
                    q.add(num.right);
                }
            }
                res.add(new ArrayList<>(list));
                list.clear();
            }
        }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
        {
            return res;
        }
        helpFunction(res,root);
        return res;
    }
}
