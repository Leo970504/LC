package LeetCode;

import java.util.Stack;

public class Solution716最大栈 {
    Stack<Integer> stack;
    Stack<Integer> maxStack;
    /** initialize your data structure here. */
    public Solution716最大栈() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }
    public void push(int x) {
        if(stack.isEmpty() && maxStack.isEmpty()) {
            stack.push(x);
            maxStack.push(x);
            return;
        }
        if(x > maxStack.peek()) {
            maxStack.push(x);
        } else {
            maxStack.push(maxStack.peek());
        }
        stack.push(x);
    }
    public int pop() {
        maxStack.pop();
        return stack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public int peekMax() {
        return maxStack.peek();
    }
    public int popMax() {
        int max = maxStack.peek();
        Stack<Integer> buffer = new Stack<>();
        while(top() != max) buffer.push(pop());
        pop();
        while(!buffer.isEmpty()) push(buffer.pop());
        return max;
    }
}
