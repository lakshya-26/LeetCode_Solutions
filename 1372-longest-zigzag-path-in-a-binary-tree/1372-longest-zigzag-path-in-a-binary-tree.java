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
    int max = Integer.MIN_VALUE;
    
    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;
        int l = helper(root.left, true);
        int r = helper(root.right, false);
        int v = Math.max(1 + l, 1 + r);
        return Math.max(max, v);
    }
    
    private int helper(TreeNode node, boolean left) {
        if(node == null) return -1;
        
        int lVal = helper(node.left, true), rVal = helper(node.right, false);
        int val = Math.max(lVal + 1, rVal + 1);
        max = Math.max(max, val);
        return left ? rVal + 1 : lVal + 1;
    }
}