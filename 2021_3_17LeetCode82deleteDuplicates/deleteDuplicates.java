/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // if(head == null || head.next == null){
        //     return head;
        // }
        // Stack<Integer> stack = new Stack<>();
        // stack.push(head.val);
        // ListNode cur = head.next;
        // ListNode pHead = new ListNode(-10000);
        // pHead.next = head;
        // ListNode pre1 = pHead;
        // ListNode pre2 = pHead;
        // ListNode temp = head;
        // while(cur != null){
        //     while(cur!= null && stack.peek() == cur.val){
        //         pre2 = cur;
        //         cur = cur.next;
        //     }
        //     if(stack.peek() ==pre2.val){
        //         stack.pop();
        //         pre1.next = cur;
        //         temp = cur;
        //         if(cur != null){
        //             stack.push(cur.val);
        //         }
        //     }else{
        //         stack.push(cur.val);
        //         temp.next = cur;
        //         pre1 = temp;
        //         pre2 = temp;
        //         temp = temp.next;
        //     }
        //     if(cur != null){
        //         cur = cur.next;
        //     }
        // }
        // return pHead.next;
        if(head == null || head.next == null){
            return head;
        }
        ListNode pHead = new ListNode(-1000);
        ListNode temp = pHead;
        ListNode cur = head;
        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                cur = cur.next;
            }
            if(cur == null){
                break;
            }            
            if(cur.next != null && cur.val == cur.next.val){
                continue;
            }
            temp.next = cur;
            temp =  temp.next;
            cur = cur.next;
        }
        temp.next = cur;
        return pHead.next;
    }
}