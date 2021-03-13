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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        int k  = 1;
        ListNode pA = head;
        ListNode cur1 = pA;
        ListNode pB = head.next;
        ListNode cur2 = pB;
        ListNode cur = cur2.next;
        while(cur != null){
            if(k % 2 ==1){
                cur1.next = cur;
                cur1 = cur1.next;
            }else{
                cur2.next = cur;
                cur2 = cur2.next;
            }
            k++;
            cur = cur.next;
        }
        cur2.next = null;
        cur1.next = pB;
        return head;
    }
}