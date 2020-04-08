package LeetCode每日一题;

import java.util.ArrayList;
import java.util.List;

public class Solution22括号生成 {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return res;
    }

    private void dfs(int left, int right, String curStr) {
        if(left == 0 && right == 0) {
            res.add(curStr);
        }
        if(left > 0) {
            dfs(left - 1, right, curStr + "(");
        }
        if(right > left) {
            dfs(left, right - 1, curStr + ")");
        }
    }
}
