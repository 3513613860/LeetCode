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
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> subList = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        back(root,target);
        return list;
    }

    public void back(TreeNode root,int curSum){
        if(root == null){
            return;
        }    
        subList.add(root.val);
        curSum -= root.val;
        if(curSum == 0 && root.left==null && root.right==null){
            list.add(new ArrayList(subList));
        }

        back(root.left,curSum);
        back(root.right,curSum);
        subList.remove(subList.size()-1);
    }
}