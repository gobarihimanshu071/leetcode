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
        Stack<TreeNode> s = new Stack<>();
        List<Integer> ans = new Stack<>();
        TreeNode curr = root;
        if(root==null)
        return ans;
        TreeNode prev = null;
        while(curr!=null || !s.isEmpty()){
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            TreeNode peek = s.peek();
            if(peek.right!=null && peek.right!=prev){
                curr=peek.right;
            }
            else{
                ans.add(peek.val);
                prev=s.pop();
            }
        }
        return ans;
    }
}