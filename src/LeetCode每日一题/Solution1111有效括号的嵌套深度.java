package LeetCode每日一题;

import java.util.Stack;

public class Solution1111有效括号的嵌套深度 {

    public int[] maxDepthAfterSplit(String seq) {
        int index = 0;
        int count = -1;
        int[] res = new int[seq.length()];
        while(index < seq.length()) {
            if(seq.charAt(index) == '(') {
                count++;
                res[index] = count % 2;
            } else if(seq.charAt(index) == ')') {
                res[index] = count % 2;
                count--;
            }
            index++;
        }
        return res;
    }
}
