/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //递归的终止条件
        if(root == null || root == p || root == q){
            return root;
        }

        //采用后序遍历
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        //根据left和right的值返回给root，从下往上走，赋值给上一个结点
        if(left == null && right == null){
            return null;
        }
        if(left != null && right == null){
            return left;
        }
        if(left == null && right != null){
            return right;
        }
        if(left != null && right != null){
            return root;
        }

        //返回根节点
        return root;
    }
}