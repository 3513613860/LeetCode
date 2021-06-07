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
    ArrayList<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < list.size(); i++){
            int cur = Math.abs(list.get(i)-list.get(i-1));
            if(cur < min){
                min = cur;
            }
        }
        return min;
    }

    public void inOrder(TreeNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        list.add(node.val);
        inOrder(node.right);
    }
}