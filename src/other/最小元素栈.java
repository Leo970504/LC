package other;

import java.util.Stack;
/*
定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。


思路：用一个栈data保存数据，用另外一个栈min保存依次入栈最小的数
比如，data中依次入栈，5,  4,  3, 8, 10, 11, 12, 1
       则min依次入栈，5,  4,  3，no,no, no, no, 1

no代表此次不如栈
每次入栈的时候，如果入栈的元素比min中的栈顶元素小或等于则入栈，否则不如栈。
 */
public class 最小元素栈 {

    Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> minS = new Stack<Integer>();
    public void push(int node) {
        s.push(node);
        if(minS.isEmpty()) {
            minS.push(node);
        }
        if(node <= minS.peek()) {
            minS.push(node);
        }
    }

    public void pop() {
        if(minS.peek() == s.peek()) {
            minS.pop();
        }
        s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int min() {
        return minS.peek();
    }
}
