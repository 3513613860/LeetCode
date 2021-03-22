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
    // public boolean isBalanced(TreeNode root) {
    //     if(root == null){
    //         return true;
    //     }
    //     int a = getHeight(root.left);
    //     int b = getHeight(root.right);
    //     if(Math.abs(a-b) > 1){
    //         return false;
    //     }
    //     return isBalanced(root.left) && isBalanced(root.right);
    // }

    // public int getHeight(TreeNode root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int a = getHeight(root.left);
    //     int b = getHeight(root.right);
    //     return a > b ? a + 1: b+1;
    // }


    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return getHeight(root) >= 0;
    }

    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(left >= 0 && right >= 0 && Math.abs(left - right) <= 1){
            return Math.max(left,right)+1;
        }else{
            return -1;
        }
    }
}