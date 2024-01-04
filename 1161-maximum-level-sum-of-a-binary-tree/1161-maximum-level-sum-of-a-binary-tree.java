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
     int mxSum = Integer.MIN_VALUE;
    int minLevel =1;
    public int maxLevelSum(TreeNode root) {
        int level =1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(q.size()>0){
            int size=q.size();
            int sum =0;
            while(size-->0){
                TreeNode node = q.remove();
                sum+=node.val;
                if(node.left!=null)
                q.offer(node.left);
                if(node.right!=null)
                q.offer(node.right);
            }
            if(sum>mxSum){
                minLevel = level;
                mxSum = sum;
            }
            level++;
        }

        return minLevel;
    }
}