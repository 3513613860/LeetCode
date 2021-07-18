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
    List<Integer> list = new ArrayList<>();
    public void flatten(TreeNode root) {
        dfs(root);
        TreeNode cur = root;
        if(cur != null){
            cur.left = null;
        }
        for(int i = 1; i < list.size(); i++){
            TreeNode node = new TreeNode(list.get(i));
            cur.right = node;
            cur = node;
        }
        if(cur != null){
            cur.right = null;
        }
    }

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }

        list.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}