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
 */class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        return true;

        return symmetric(root.left,root.right);
        
        
    }

    private boolean symmetric(TreeNode Left,TreeNode Right)
    {
        if(Left==null&&Right==null)
        return true;

        if(Left==null||Right==null)
        return false;

        if(Left.val!=Right.val)
        return false;

return(symmetric(Left.left,Right.right)&&symmetric(Left.right,Right.left));

    }
}