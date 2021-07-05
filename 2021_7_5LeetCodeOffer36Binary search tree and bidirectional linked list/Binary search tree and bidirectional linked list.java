/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    List<Node> list = new ArrayList<>();
    public Node treeToDoublyList(Node root) {
        if(root == null){
            return root;
        }
        inorder(root);
        Node head = list.get(0);
        Node pre = head;
        for(int i = 1; i < list.size(); i++){
            Node cur = list.get(i);
            pre.right = cur;
            cur.left = pre;
            pre = cur;
        }

        head.left = pre;
        pre.right = head;
        return head;
    }

    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
}