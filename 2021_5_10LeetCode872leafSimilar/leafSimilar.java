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
    int [] nums1 = new int [200];
    int [] nums2 = new int [200];
    int j = 0;
    int k = 0;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        inOrder(root1);
        inOrder2(root2);
        if(j != k){
            return false;
        }

        for(int i = 0; i < j; i++){
            if(nums1[i] != nums2[i]){
                return false;
            }
        }
        return true;
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right==null){
            nums1[j++] = root.val;
        }
        inOrder(root.left);
        inOrder(root.right);
    }

    public void inOrder2(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right==null){
            nums2[k++] = root.val;
        }
        inOrder2(root.left);
        inOrder2(root.right);
    }    
}