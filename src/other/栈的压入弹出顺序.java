package other;

import java.util.Stack;

public class 栈的压入弹出顺序 {
    /*
    题目描述
输入两个整数序列，第一个序列表示栈的压入顺序，
请判断第二个序列是否可能为该栈的弹出顺序。
假设压入栈的所有数字均不相等。
例如序列1,2,3,4,5是某栈的压入顺序，
序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
但4,3,5,1,2就不可能是该压栈序列的弹出序列。
（注意：这两个序列的长度是相等的）


思路：新建一个栈，将数组A压入栈中，当栈顶元素等于数组B时，就将其出栈，当循环结束时，判断栈是否为空，若为空则返回true.
     */


    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0 || popA.length == 0 || popA.length != pushA.length) {
            return false;
        }
        Stack<Integer> s = new Stack<Integer>();
        int p = 0;
        int q = 0;
        while(p < popA.length) {
            s.push(pushA[p]);
            if(s.peek() == popA[q]) {
                s.pop();
                q++;
            }
            p++;
        }
        while(!s.isEmpty()) {
            if(s.peek() == popA[q]) {
                s.pop();
                q++;
            }else {
                return false;
            }
        }
        return true;
    }
}
