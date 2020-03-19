package other;

/*
题目描述
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class 删除链表中重复的元素 {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode head = new ListNode(-1);
        head.next = pHead;
        ListNode res = head;
        while(head.next != null) {
            if(pHead.next == null) {
                break;
            }
            if(pHead.val == pHead.next.val) {
                while(pHead.next !=null && pHead.val == pHead.next.val) {
                    pHead = pHead.next;
                }
                head.next = pHead.next;
                pHead = head.next;
            }else {
                head = head.next;
                pHead = pHead.next;
            }
        }
        return res.next;
    }
}
