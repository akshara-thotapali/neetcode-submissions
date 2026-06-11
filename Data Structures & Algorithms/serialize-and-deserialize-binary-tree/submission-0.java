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

public class Codec {
    public void construct(TreeNode root,StringBuilder sb)
    {
        if(root==null)
        {
            sb.append("N,");
            return;
        }
        if(root!=null)
        {
            sb.append(root.val+",");
        }
            construct(root.left,sb);
            construct(root.right,sb);
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
        {
            return "";
        }
       StringBuilder sb=new StringBuilder();
       construct(root,sb);
       return sb.toString(); 
    }
    public TreeNode deconstruct(String[] tokens,int[] index)
    {
        if(tokens[index[0]].equals("N"))
        {
            index[0]++;
            return null;
        }
       TreeNode root=new TreeNode(Integer.parseInt(tokens[index[0]++]));
        root.left=deconstruct(tokens,index);
        root.right=deconstruct(tokens,index);
        return root;
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0)
        {
            return null;
        }
       String[] tokens=data.split(",");
       int[] index={0};
        return deconstruct(tokens,index);
    }
}
