package LeetCode剑指Offer;

import sun.jvm.hotspot.debugger.Page;

public class Solution22链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode nextK = head;
        for(int i = 1; i < k; i++) {
            nextK = nextK.next;
        }
        while(nextK.next != null) {
            nextK = nextK.next;
            head = head.next;
        }
        return head;
    }
}
