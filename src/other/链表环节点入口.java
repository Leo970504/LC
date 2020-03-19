package other;
/*
题目描述
给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */

public class 链表环节点入口 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null) {
            return null;
        }
        ListNode l = pHead;
        ListNode r = pHead;
        // 1.判断链表中有环
        boolean flag = false;
        while(l != null && r.next !=null) {
            l = l.next;
            r = r.next.next;
            if(l == r) {
                flag = true;
                break;
            }
        }
        if(flag == false) return null;
        // 2.得到环中节点的数目
        int count = 1;
        while(r.next != l) {
            r = r.next;
            count++;
        }
        // 3.找到环中的入口节点
        l = r = pHead;
        for(int i=0; i<count; i++) {
            r = r.next;
        }
        while(r != l) {
            r = r.next;
            l = l.next;
        }
        return l;
    }
}
