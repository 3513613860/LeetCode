/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        //单调栈的思路
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        ListNode pre = head;
        //单调栈，单调递减
        Stack<ListNode> stack = new Stack<>();
        //Map用来映射node结点与下一个较大的值的关系
        Map<ListNode,Integer> map = new HashMap<>();
        
        while(head != null){
            //栈不为空并且当前值大于栈顶元素的值时
            while(stack.size() != 0 && head.val > stack.peek().val){
                map.put(stack.pop(),head.val);
            }
            //小于直接添加
            list.add(head.val);
            stack.push(head);
            head = head.next;
        }

        int [] nums = new int[list.size()];
        //通过map的映射关系来查找值
        for(int i = 0; i < list.size(); i++){
            nums[i] = map.getOrDefault(cur,0);
            cur = cur.next;
        }
        return nums;
    }
}