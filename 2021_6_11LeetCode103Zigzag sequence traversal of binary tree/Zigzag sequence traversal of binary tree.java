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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> initList = new ArrayList<>();
        initList.add(root.val);
        list.add(initList);
        while(queue.size() > 0){
            int size = queue.size();
            List<Integer> subList = new ArrayList<>();
            while(size > 0){
                TreeNode cur = queue.poll();
                if(cur.left != null ){
                    queue.offer(cur.left);
                    subList.add(cur.left.val);
                }
                if(cur.right != null){
                    queue.offer(cur.right);
                    subList.add(cur.right.val);
                }
                size--;
            }
            if(subList.size() != 0){
                list.add(subList);
            }
        }

        for(int i = 0; i < list.size(); i++){
            if(i % 2 != 0){
                List<Integer> curList = list.get(i);
                int k = 0;
                int j = curList.size()-1;
                while(k <j){
                    int temp = curList.get(k);
                    int temp2 = curList.get(j);
                    curList.set(k,temp2);
                    curList.set(j,temp);
                    k++;
                    j--;
                }

            }
        }
        return list;
    }
}