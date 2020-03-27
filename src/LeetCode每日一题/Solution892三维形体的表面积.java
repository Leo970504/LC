package LeetCode每日一题;

public class Solution892三维形体的表面积 {

    /*
    public static void main(String[] args) {
        int[][] grid = new int[2][2];
        grid[0][0] = 1;
        grid[0][1] = 0;
        grid[1][0] = 0;
        grid[1][1] = 2;
        System.out.println(surfaceArea(grid));
    }
     */

    public static int surfaceArea(int[][] grid) {
        int res = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                res = res + subVal(grid, i, j);
            }
        }
        return res;
    }

    public static int subVal(int[][] grid, int i, int j) {

        if(grid[i][j] == 0) {
            return 0;
        }

        int origin = (grid[i][j] - 1) * 4 + 6;

        if(i - 1 >= 0 && i - 1 < grid.length && j >= 0 && j < grid[0].length) {
            int temp = Math.min(grid[i][j], grid[i - 1][j]);
            origin = origin - temp;
        }

        if(i + 1 >= 0 && i + 1 < grid.length && j >= 0 && j < grid[0].length) {
            int temp = Math.min(grid[i][j], grid[i + 1][j]);
            origin = origin - temp;
        }

        if(i >= 0 && i < grid.length && j - 1 >= 0 && j - 1 < grid[0].length) {
            int temp = Math.min(grid[i][j], grid[i][j - 1]);
            origin = origin - temp;
        }

        if(i >= 0 && i < grid.length && j + 1 >= 0 && j + 1 < grid[0].length) {
            int temp = Math.min(grid[i][j], grid[i][j + 1]);
            origin = origin - temp;
        }
        return origin;
    }
}
