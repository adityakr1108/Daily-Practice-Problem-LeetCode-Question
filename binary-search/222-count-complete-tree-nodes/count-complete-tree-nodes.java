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
    int ans;
    public int countNodes(TreeNode root) {
        ans = 0;
        findNodes(root);
        return ans;
    }
    void findNodes(TreeNode root){
        if(root == null) return;
        ans++;
        findNodes(root.left);
        findNodes(root.right);
    }
}