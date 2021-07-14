/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Node>> list = new ArrayList<>();

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Node> subList = new ArrayList<>();
            while(size > 0){
                Node cur = queue.poll();
                subList.add(cur);
                size--;
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
            List<Node> curList = list.get(i);
            Node pre = curList.get(0);
            int size = curList.size();
            if(size == 1){
                pre.next = null;
            }
            for(int j = 1; j <= size; j++){
                if(j == size){
                    curList.get(j-1).next = null;
                }else{
                    pre.next = curList.get(j);
                    pre = curList.get(j);
                }
            }
        }
        return root;
    }
}