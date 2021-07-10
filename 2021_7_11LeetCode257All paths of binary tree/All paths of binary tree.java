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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        String sb = "";
        back(root,list,sb);
        return list;
    }

    public void back(TreeNode root,List<String> list,String sb){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            sb+=root.val;
            list.add(sb);
            return;
        }
        back(root.left,list,sb+root.val+"->");
        back(root.right,list,sb+root.val+"->");
    }
}