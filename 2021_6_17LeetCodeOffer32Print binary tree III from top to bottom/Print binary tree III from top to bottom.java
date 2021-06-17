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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if(root == null){
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subList = new ArrayList<>();
            while(size > 0){
                size--;
                TreeNode cur = queue.poll();
                subList.add(cur.val);

                if(cur.left != null){
                    queue.offer(cur.left);
                }

                if(cur.right != null){
                    queue.offer(cur.right);
                }
            }
            list.add(subList);
        }

        for(int i = 0; i < list.size(); i++){
            if(i % 2 == 1){
                List<Integer> curList = list.get(i);
                int j = 0;
                int k = curList.size() - 1;
                while(j < k){
                    int a = curList.get(j);
                    int b = curList.get(k);
                    curList.set(j,b);
                    curList.set(k,a);
                    j++;
                    k--;
                }
            }
        }
        return list;
    }
}