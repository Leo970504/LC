package LeetCode剑指Offer;

public class Solution16打印从1到最大的n位数 {
    public int[] printNumbers(int n) {
        int x = 1;
        while(n != 0) {
            x = x * 10;
            n--;
        }
        int p = 0;
        int[] res = new int[x - 1];
        while(p < x - 1) {
            res[p] = p + 1;
            p++;
        }
        return res;
    }
}
