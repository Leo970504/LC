package sort;
/*

输入一个链表，按链表从尾到头的顺序返回一个ArrayList。

这里：递归解决
*/

import java.util.ArrayList;

public class 反向打印链表 {
    ArrayList<Integer> arr = new ArrayList();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            arr.add(listNode.val);
        }
        return arr;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

