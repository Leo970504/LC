package LeetCode;

public class Solution328奇偶链表 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode head2 = head.next;
        ListNode odd = head;
        ListNode even = head.next;
        while(odd.next != null && even.next != null) {
            odd.next = even.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = head2;
        return head;
    }
}
