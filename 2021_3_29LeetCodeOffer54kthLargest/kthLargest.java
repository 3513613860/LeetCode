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
    int [] arr = new int [10000];
    int count = 0;
    public int kthLargest(TreeNode root, int k) {
        inOrder(root);
        return arr[count-k];
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        arr[count++] = root.val;
        inOrder(root.right);
    }
}