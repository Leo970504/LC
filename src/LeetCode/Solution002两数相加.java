package LeetCode;

public class Solution002两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode head = res;
        int ans = 0;
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + ans;
            ListNode next = new ListNode(sum % 10);
            res.next = next;
            ans = sum /10;
            l1 = l1.next;
            l2 = l2.next;
            res = res.next;
        }
        if(l1 == null && l2 == null) {
            if(ans == 1) {
                ListNode next = new ListNode(1);
                res.next = next;
            }
            return head.next;
        }
        ListNode node = l1 != null ? l1 : l2;
        while(node != null) {
            int sum = node.val + ans;
            ListNode next = new ListNode(sum % 10);
            res.next = next;
            ans = sum / 10;
            node = node.next;
            res = res.next;
        }
        if(ans == 1) {
            ListNode next = new ListNode(1);
            res.next = next;
        }
        return head.next;
    }
}
