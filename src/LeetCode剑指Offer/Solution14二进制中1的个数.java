package LeetCode剑指Offer;

public class Solution14二进制中1的个数 {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
