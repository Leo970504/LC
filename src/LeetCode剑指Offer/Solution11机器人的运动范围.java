package LeetCode剑指Offer;

public class Solution11机器人的运动范围 {
    private int res = 0;
    private int m, n, k;
    boolean[][] matrix;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        matrix = new boolean[m][n];
        dfs(0, 0);
        return res;
    }

    public void dfs(int i, int j) {
        if (i >= 0 && i < m && j >= 0 && j < n && digit(i) + digit(j) <= k && matrix[i][j] != true) {
            res++;
            matrix[i][j] = true;
            dfs(i + 1, j);
            dfs(i - 1, j);
            dfs(i, j + 1);
            dfs(i, j - 1);
        }
    }

    public int digit(int num) {
        int val = 0;
        while (num != 0) {
            val += num % 10;
            num = num / 10;

        }
        return val;
    }
}
