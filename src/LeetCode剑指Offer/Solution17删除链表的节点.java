package LeetCode剑指Offer;

public class Solution17删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val) {
            head = head.next;
            return head;
        }
        ListNode cur = head.next;
        ListNode pre = head;
        while(cur != null) {
            if(cur.val == val) {
                pre.next = cur.next;
            }
            pre = pre.next;
            cur = cur.next;
        }
        return head;
    }
}
