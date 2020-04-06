package LeetCode每日一题;

public class Solution面试题0107旋转数组 {

    public void rotate(int[][] matrix) {
        int N = matrix.length;
        int[][] res = new int[N][N];
        int mid = 0;
        while(mid < N) {
            int i = mid;
            while(i < N) {
                int temp = matrix[mid][i];
                matrix[mid][i] = matrix[i][mid];
                matrix[i][mid] = temp;
                i++;
            }
            mid++;
        }
        for(int row = 0; row < N; row++) {
            int left = 0;
            int right = N - 1;
            while(left < right) {
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
                left++;
                right--;
            }
        }
    }
}
