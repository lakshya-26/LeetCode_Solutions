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
    List<Integer> l = new LinkedList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            List<Integer> l = new LinkedList<Integer>();
            return l;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        l.add(root.val);
        return l;
    }
}