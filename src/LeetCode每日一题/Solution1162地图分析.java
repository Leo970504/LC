package LeetCode每日一题;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1162地图分析 {

    public int maxDistance(int[][] grid) {
        int N = grid.length;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 1) queue.add(i * N + j);
            }
        }
        if (queue.size() == 0 || queue.size() == N * N) {
            return -1;
        }
        int d = 1;
        while (!queue.isEmpty()) {
            int len = queue.size();
            d += 1;
            for (int i = 0; i < len; i++) {
                int land = queue.remove();
                int x = land / N;
                int y = land % N;
                if (x + 1 >= 0 && x + 1 < N && y >= 0 && y < N && grid[x + 1][y] == 0) {
                    grid[x + 1][y] = d;
                    queue.add((x + 1) * N + y);
                }
                if (x - 1 >= 0 && x - 1 < N && y >= 0 && y < N && grid[x - 1][y] == 0) {
                    grid[x - 1][y] = d;
                    queue.add((x - 1) * N + y);
                }
                if (x >= 0 && x < N && y + 1>= 0 && y + 1 < N && grid[x][y + 1] == 0) {
                    grid[x][y + 1] = d;
                    queue.add(x * N + y + 1);
                }
                if (x >= 0 && x < N && y - 1 >= 0 && y - 1 < N && grid[x][y - 1] == 0) {
                    grid[x][y - 1] = d;
                    queue.add(x * N + y - 1);
                }
            }
        }
        return d - 2;
    }
}
