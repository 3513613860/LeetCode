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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }

        for(int i = 1; i < lists.length-1; i++){
            merge(lists,lists[0],lists[i]);
        }
        return merge(lists,lists[0],lists[lists.length-1]);
    }

    public ListNode merge(ListNode[] lists,ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(l1!= null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        while(l1 != null){
            cur.next = l1;
            cur = cur.next;
            l1 = l1.next;
        }
        while(l2 != null){
            cur.next = l2;
            cur = cur.next;
            l2 = l2.next;
        }
        lists[0] = dummy.next;
        return lists[0];
    }
}