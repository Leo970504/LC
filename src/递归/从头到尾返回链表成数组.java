package 递归;

import java.util.ArrayList;

public class 从头到尾返回链表成数组 {

    ArrayList<Integer> arr = new ArrayList();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode != null) {
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
