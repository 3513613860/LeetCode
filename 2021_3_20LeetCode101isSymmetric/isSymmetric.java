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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return false;
        }
        return isSame(root.left,root.right);
    }

    public boolean isSame(TreeNode left, TreeNode right){
        //左边等于null时，如果右边等于null,返回true；否则返回false
        if(left == null){
            return right == null;
        }

        //右边等于null时，返回false
        if(right == null){
            return false;
        }

        //左右均不为空，且值不相等时
        if(left.val != right.val){
            return false;
        }
        
        return isSame(left.right,right.left) && isSame(left.left,right.right);
    }
}