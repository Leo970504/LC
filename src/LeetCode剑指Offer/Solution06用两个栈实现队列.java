package LeetCode剑指Offer;

import java.util.Stack;

public class Solution06用两个栈实现队列 {

    Stack<Integer> s1;
    Stack<Integer> s2;
    int size;

    public Solution06用两个栈实现队列() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        size = 0;
    }

    public void appendTail(int value) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s2.push(value);
        size++;
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int deleteHead() {
        if (size == 0) {
            return -1;
        }
        size--;
        return s1.pop();
    }
}
