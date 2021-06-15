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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //第一种解决方案
        // List<List<Integer>> list = new ArrayList<>();
        // if(root == null) {
        //     return list;
        // }

        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.offer(root);
        // while(queue.size() > 0){
        //     int size = queue.size();
        //     List<Integer> subList = new ArrayList<>();
        //     while(size > 0){
        //         TreeNode cur = queue.poll();
        //         subList.add(cur.val);

        //         if(cur.left != null){
        //             queue.offer(cur.left);
        //         }

        //         if(cur.right != null){
        //             queue.offer(cur.right);
        //         }
        //         size--;
        //     }
        //     list.add(subList);
        // }

        // int left = 0;
        // int right = list.size()-1;
        // while(left < right){
        //     List<Integer> list1 = list.get(left);
        //     List<Integer> list2 = list.get(right);
        //     list.set(left,list2);
        //     list.set(right,list1);
        //     left++;
        //     right--;
        // }
        // return list;


        //第二种解决方案
        LinkedList<List<Integer>> list = new LinkedList<>();
        if(root == null){
            return list;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(queue.size() > 0){
            int size = queue.size();
            LinkedList<Integer> subList = new LinkedList<>();
            while(size > 0){
                TreeNode cur = queue.poll();
                subList.add(cur.val);

                if(cur.left != null){
                    queue.offer(cur.left);
                }

                if(cur.right != null){
                    queue.offer(cur.right);
                }
                size--;
            }
            list.addFirst(subList);
        }
        return list;
    }
}