package LeetCode剑指Offer;

public class Solution10矩阵中的路径 {
    boolean[][] visited = null;

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        if (board == null || board.length == 0 || rows * cols < word.length()) {
            return false;
        }
        visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (find(board, rows, cols, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean find(char[][] board, int rows, int cols, int row, int col, String word, int index) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            return false;
        }
        if (visited[row][col] == true || board[row][col] != word.charAt(index)) {
            return false;
        }
        visited[row][col] = true;
        boolean flag = find(board, rows, cols, row + 1, col, word, index + 1) ||
                find(board, rows, cols, row - 1, col, word, index + 1) ||
                find(board, rows, cols, row, col + 1, word, index + 1) ||
                find(board, rows, cols, row, col - 1, word, index + 1);
        visited[row][col] = false;
        return flag;
    }
}
