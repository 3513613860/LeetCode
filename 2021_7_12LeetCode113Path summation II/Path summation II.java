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
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> subList = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        int cur = 0;
        back(root,cur,sum);
        return list;
    }

    public void back(TreeNode root,int cur,int sum){
        //终止条件
        if(root == null){
            return;
        }
        //终止条件
        if(root.left == null && root.right == null){
            cur += root.val;
            subList.add(root.val);
            //如果cur等于sum，就将集合存放人list当中
            if(cur == sum){
                list.add(new ArrayList<>(subList));
            }
            //将最后一个元素删除
            subList.remove(subList.size()-1);
            return;
        }
        //向subList中存放元素
        subList.add(root.val);
        //左子树
        back(root.left,cur+root.val,sum);
        //右子树
        back(root.right,cur+root.val,sum);
        //删除集合最后一个元素
        subList.remove(subList.size()-1);
    }
}