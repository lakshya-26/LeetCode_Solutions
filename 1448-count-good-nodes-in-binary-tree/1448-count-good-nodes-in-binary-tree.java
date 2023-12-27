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
    public int goodNodes(TreeNode root) {
        int count = 1;
        int max = root.val;
        count  += goodNodesUtil(root.left, max) +  goodNodesUtil(root.right, max);
        return count;
    }
    
    private int goodNodesUtil(TreeNode root, int max){
        if(root == null){
            return 0;
        }
        
        int count = 0;
        if(root.val >= max){
            count++;
            max = root.val;
        }
        
        count += goodNodesUtil(root.left, max) + goodNodesUtil(root.right, max);
        return count;
    }
}