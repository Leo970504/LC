package LeetCode剑指Offer;

public class Solution23反转链表 {

    public ListNode reverseList(ListNode head) {
        ListNode cur = null;
        ListNode pre = head;
        while(pre != null) {
            ListNode temp = pre.next;
            pre.next = cur;
            cur = pre;
            pre = temp;
        }
        return cur;
    }
}
