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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<>();
        List<Integer> ans = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        if(root==null)return ans;
        s1.push(root);

        while(!s1.isEmpty()){
            TreeNode node = s1.pop();
            s2.push(node.val);
            if(node.left!=null)s1.push(node.left);
            if(node.right!=null)s1.push(node.right);
        }
        while(!s2.isEmpty()){
            ans.add(s2.pop());
        }
        return ans;
    }
}