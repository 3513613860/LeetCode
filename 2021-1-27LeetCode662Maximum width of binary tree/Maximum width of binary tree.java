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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        LinkedList<Integer> indexList = new LinkedList<>();
        queue.offer(root);
        indexList.add(1);
        int size = 1;
        int k = 1;
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            size--;
            int index = indexList.poll();
            if(cur.left != null){
                queue.offer(cur.left);
                indexList.add(2 * index);
            }
            if(cur.right != null){
                queue.offer(cur.right);
                indexList.add(2 * index + 1);
            }
            if (size == 0) {
				if(indexList.size() >= 2) {
					k = Math.max(k, indexList.getLast()-                                           indexList.getFirst() + 1);
				}
                size = queue.size();
			}
        }
        return k;
    }
}