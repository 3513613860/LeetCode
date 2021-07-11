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
    public int k = 1;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        List<Integer> list = new ArrayList<>();
        getSum(root,sum,0,list);
        return list.size() > 0 ? true:false;
    }

    public void getSum(TreeNode root,int sum,int cur,List<Integer> list){
        if(root == null){
            return;
        }   
        if(root.left == null && root.right == null){
            cur+=root.val;
            if(cur == sum){
                list.add(k++);
            }
            return;
        }     
        getSum(root.left,sum,cur+root.val,list);
        getSum(root.right,sum,cur+root.val,list);
    }
}