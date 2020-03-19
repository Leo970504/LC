package other;

import java.util.Stack;

//输入一个链表，输出该链表中倒数第k个结点。
/*
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/

public class 链表倒数元素 {

    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k == 0) {
            return null;
        }
        Stack<ListNode> sk = new Stack<ListNode>();
        while(head != null) {
            sk.push(head);
            head = head.next;
        }
        int count = 1;
        while(!sk.isEmpty()) {
            if(count == k) {
                return sk.pop();
            }
            sk.pop();
            count++;
        }
        return null;
    }
}
