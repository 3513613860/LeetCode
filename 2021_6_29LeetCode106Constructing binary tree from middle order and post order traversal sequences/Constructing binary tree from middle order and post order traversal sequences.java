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
    int ret = 0;
    public int findValInorder(int[] inorder,int key,int inbegin,int inend) {
        for(int i = inbegin;i <= inend; i++) {
            if(inorder[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode buildTreeChild(int []inorder,int[]postorder,int inbegin,int inend){

        if(inbegin > inend){
            return null;
        }
        TreeNode root = new TreeNode(postorder[ret]);
        int index = findValInorder(inorder,postorder[ret],inbegin,inend);
        ret--;
        root.right = buildTreeChild(inorder,postorder,index+1,inend);
        root.left = buildTreeChild(inorder,postorder,inbegin,index-1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        ret = postorder.length-1;
        if(inorder == null || postorder == null) return null;
        if(inorder.length == 0|| postorder.length == 0) return null;

        return buildTreeChild(inorder,postorder,0,inorder.length-1);
    }
}