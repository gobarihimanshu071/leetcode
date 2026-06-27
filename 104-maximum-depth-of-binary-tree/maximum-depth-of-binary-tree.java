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

    public static int m(TreeNode root){
        if(root==null)return 0;
        int l = 1+m(root.left);
        int r = 1+m(root.right);
        return Math.max(l,r);

    }
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return m(root);
    }
}