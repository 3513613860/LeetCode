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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        //两个节点都为null
        if(t1 ==null && t2 ==null){
            return null;
        }
        //两个根节点有一个为null
        else if (t1 == null || t2==null){
            return t1==null?t2:t1;
        }
        //两个节点都不为空
        else{
            t1.val+=t2.val;
            t1.left=mergeTrees(t1.left,t2.left);
            t1.right=mergeTrees(t1.right,t2.right);
        }
        return t1;
    }
}