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
    List<String> ans;
    public int sumRootToLeaf(TreeNode root) {
        ans = new ArrayList<>();
        solve("",root);
        int finalAns = 0;
        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
            finalAns += Integer.parseInt(ans.get(i),2);
        }
        return finalAns;
    }
    void solve(String temp, TreeNode root){
        if(root == null){
            return;
            }
            temp = temp + root.val;
            if(root.left == null && root.right == null){
                ans.add(temp);
                return;
            }
        solve(temp,root.left);
        solve(temp,root.right);
    }

}