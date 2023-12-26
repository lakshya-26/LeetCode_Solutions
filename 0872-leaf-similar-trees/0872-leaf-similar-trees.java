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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> out1 = new LinkedList<>();
        List<Integer> out2 = new LinkedList<>();
        inOrderTraversal(root1, out1);
        inOrderTraversal(root2, out2);
        return out1.equals(out2);
    }

    private void inOrderTraversal(TreeNode root, List<Integer> out) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            out.add(root.val);
        }
        if (root.left != null) {
            inOrderTraversal(root.left, out);
        }
        if (root.right != null) {
            inOrderTraversal(root.right, out);
        }
    }
}
