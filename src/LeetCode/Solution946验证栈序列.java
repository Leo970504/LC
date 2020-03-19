package LeetCode;

import java.util.Stack;

public class Solution946验证栈序列 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int i = 0;
        int j = 0;
        while (i < pushed.length) {
            if (!s.isEmpty() && popped[j] == s.peek()) {
                s.pop();
                j++;
            } else if (pushed[i] == popped[j]) {
                s.push(pushed[i]);
                s.pop();
                i++;
                j++;
            } else {
                s.push(pushed[i]);
                i++;
            }
        }
        while (!s.isEmpty()) {
            if (s.peek() == popped[j]) {
                s.pop();
                j++;
            } else {
                break;
            }
        }
        return s.isEmpty();
    }
}
