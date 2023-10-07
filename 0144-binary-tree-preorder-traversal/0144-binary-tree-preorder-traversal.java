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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            List<Integer> l = new LinkedList<Integer>();
            return l;
        }
        l.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return l;
    }
}