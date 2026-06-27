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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> s = new LinkedList<>();
        if(root==null)return ans;
        s.add(root);
        while( !s.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int n = s.size();
            while(n!=0){
                TreeNode node = s.poll();
                l.add(node.val);
                if(node.left!=null)s.add(node.left);
                if(node.right!=null)s.add(node.right);
                n--;

            }
            ans.add(l);
        }
        return ans;
    }
}