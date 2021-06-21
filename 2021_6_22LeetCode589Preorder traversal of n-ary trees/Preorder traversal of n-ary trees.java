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
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        preOrder(root);
        return list;
    }

    public void preOrder(Node root){
        if(root == null){
            return;
        }
        list.add(root.val);
        List<Node> child = root.children;
        for(int i = 0; i < child.size(); i++){
            preOrder(child.get(i));
        }
    }
}