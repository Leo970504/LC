package LeetCode剑指Offer;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution04从头到尾打印链表 {
    ArrayList<Integer> arr = new ArrayList<>();

    public int[] reversePrint(ListNode head) {
        if (head != null) {
            reversePrint(head.next);
            arr.add(head.val);
        }
        return func(arr);
    }

    public int[] func(ArrayList<Integer> list) {
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
