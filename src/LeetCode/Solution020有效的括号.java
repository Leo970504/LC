package LeetCode;

import java.util.Stack;

public class Solution020有效的括号 {

    public static void main(String[] args) {
        System.out.println(isValid("]{"));
    }

    public static boolean isValid(String s) {
        if(s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> sk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(temp == '(' || temp == '[' || temp == '{') {
                sk.push(temp);
                continue;
            }
            if(sk.size() == 0) return false;
            if(temp == ')') {
                if (sk.peek() == '(') {
                    sk.pop();
                } else {
                    return false;
                }
            }else if(temp == ']') {
                if(sk.peek() == '[') {
                    sk.pop();
                }else {
                    return false;
                }
            }else if(temp == '}') {
                if(sk.peek() == '{') {
                    sk.pop();
                }else {
                    return false;
                }
            }
        }
        return sk.isEmpty() ? true : false;
    }
}
