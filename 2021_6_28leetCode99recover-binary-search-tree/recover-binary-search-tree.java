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
    List<Integer> list = new ArrayList<>();

    public void recoverTree(TreeNode root) {
        inOrder(root);
        int [] nums = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        Arrays.sort(nums);
        int [] array = new int[2];
        int j = 0;
        for(int i = 0; i < list.size(); i++){
            if(nums[i] != list.get(i)){
                array[j++] = list.get(i);
            }
        }
        change(root,array);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

        public void change(TreeNode root,int [] array){
        if(root == null){
            return;
        }

        if(root.val == array[0]){
            root.val = array[1];
        }else if(root.val == array[1]){
            root.val = array[0];
        }
        change(root.left,array);
        change(root.right,array);
    }
}