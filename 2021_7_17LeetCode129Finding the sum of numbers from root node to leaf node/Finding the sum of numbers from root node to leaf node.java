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

    List<String> list = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        dfs(root,"");
        int sum = 0;
        for(int i = 0; i < list.size();i++){
            sum += Integer.parseInt(list.get(i));
        }
        return sum;
    }

    public void dfs(TreeNode root,String cur){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            cur += root.val;
            list.add(cur);
            return;
        }

        cur += root.val;
        dfs(root.left,cur);
        dfs(root.right,cur);
    }
}