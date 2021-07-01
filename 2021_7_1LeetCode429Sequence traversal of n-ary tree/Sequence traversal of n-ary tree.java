/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(root == null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subList = new ArrayList<>();
            while(size > 0){
                size--;
                Node node = queue.poll();
                subList.add(node.val);

                List<Node> subNode = node.children;
                int k = subNode.size();
                for(int i = 0; i < k; i++){
                    queue.offer(subNode.get(i));
                }
            }
            list.add(subList);
        }
        return list;
    }
}