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
    public boolean isCompleteTree(TreeNode root) {
        if(root == null){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(queue.peek() != null){
            TreeNode node = queue.poll();
            queue.offer(node.left);
            queue.offer(node.right);

        }

        while(!queue.isEmpty()){
            TreeNode  cur = queue.peek();
            if(cur != null){
                return false;
            }else{
                queue.poll();
            }
        }
        return true;
    }
}