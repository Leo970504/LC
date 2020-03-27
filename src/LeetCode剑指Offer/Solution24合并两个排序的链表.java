package LeetCode剑指Offer;

public class Solution24合并两个排序的链表 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
        ListNode head = new ListNode(-1);
        ListNode res = head;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
                head = head.next;
            }else {
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            }
        }
        if(l1 == null && l2 == null) {
            return res;
        }
        head.next = l1 != null ? l1 : l2;
        return res.next;
    }
}
