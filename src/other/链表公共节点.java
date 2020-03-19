package other;

/*
题目描述
输入两个链表，找出它们的第一个公共结点。
（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 */

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

public class 链表公共节点 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while(p1 != p2) {
            if(p1 == null) {
                p1 = pHead2;
            }else {
                p1 = p1.next;
            }
            //p1 = p1 == null ? p1 = pHead2 : p1.next;
            if(p2 == null) {
                p2 = pHead1;
            }else {
                p2 = p2.next;
            }
            //p2 = p2 == null ? p2 = pHead1 : p2.next;
        }
        return p1;
    }
}
