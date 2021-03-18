/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head.next == null){
            return head;
        }
        ListNode cur = head;
        ListNode start = head;
        ListNode end = head;
        ListNode pre = null;
        ListNode back = null;
        int a = 1;
        int b = 1;
        //找到第m个结点（让start指向该结点）
        while(a < m){
            a++;
            pre = cur;
            cur = cur.next;
        }
        start = cur;

        //找到第n个结点（让end指向该结点）
        cur = head;
        while(b < n){
            b++;
            cur = cur.next;
        }
        end = cur;
        back = end.next;
        end.next = null;        

        ListNode p1 = null;
        ListNode p2 = start;
        ListNode p3 = start.next;
        //反转单链表
        while(p2 != null){
            p2.next = p1;
            p1 = p2;
            p2 = p3;
            if(p3!= null){
                p3 = p3.next;
            }
        }
        //处理前面结点
        if(pre != null){
            pre.next = end;
        }else{
            head = p1;
        }
        //处理后面结点
        start.next = back;
        return head;
    }
}