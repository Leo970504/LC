package LeetCode剑指Offer;

public class Solution02二维数组中的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int col = matrix[0].length;
        int row = matrix.length;
        int x = 0;
        int y = matrix.length - 1;
        while(x < col && y >= 0) {
            if(matrix[y][x] > target) {
                y--;
            } else if(matrix[y][x] < target) {
                x++;
            } else if(matrix[y][x] == target) {
                return true;
            }
        }
        return false;
    }
}
