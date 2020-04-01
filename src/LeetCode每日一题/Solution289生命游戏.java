package LeetCode每日一题;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution289生命游戏 {

    public static void main(String[] args) {
        int[][] sample = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(sample);
    }
// 1 0    3 1
    public static void gameOfLife(int[][] board) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] != getGround(i, j, board)) {
                    arr.add(i);
                    arr.add(j);
                }
            }
        }
        for(int i = 0; i < arr.size(); i += 2) {
            board[arr.get(i)][arr.get(i + 1)] = board[arr.get(i)][arr.get(i + 1)] == 1 ? 0 : 1;
        }
        for(int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }

    public static int getGround(int i, int j, int[][] board) {
        if(board[i][j] == 1) {
            int count = 0;
            if(getOne(i - 1, j - 1, board) == 1) count++;
            if(getOne(i - 1, j, board) == 1) count++;
            if(getOne(i - 1, j + 1, board) == 1) count++;
            if(getOne(i, j - 1, board) == 1) count++;
            if(getOne(i, j + 1, board) == 1) count++;
            if(getOne(i + 1, j - 1, board) == 1) count++;
            if(getOne(i + 1, j, board) == 1) count++;
            if(getOne(i + 1, j + 1, board) == 1) count++;
            return count == 2 || count == 3 ? 1 : 0;
        } else if(board[i][j] == 0) {
            int count = 0;
            if(getOne(i - 1, j - 1, board) == 1) count++;
            if(getOne(i - 1, j, board) == 1) count++;
            if(getOne(i - 1, j + 1, board) == 1) count++;
            if(getOne(i, j - 1, board) == 1) count++;
            if(getOne(i, j + 1, board) == 1) count++;
            if(getOne(i + 1, j - 1, board) == 1) count++;
            if(getOne(i + 1, j, board) == 1) count++;
            if(getOne(i + 1, j + 1, board) == 1) count++;
            return count == 3 ? 1 : 0;
        }
        return -1;
    }

    public static int getOne(int i, int j, int[][] board) {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return - 1;
        }
        return board[i][j];
    }
}
