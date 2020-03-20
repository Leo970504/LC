package LeetCode剑指Offer;

public class Solution13剪绳子II {
    public int cuttingRope(int n) {
        if(n <= 3) {
            return n - 1;
        }
        int mod = (int)1e9 + 7;
        long res = 1;
        while(n > 4) {
            res = res * 3;
            n = n - 3;
            res = res % mod;
        }
        return (int)(res * n % mod);
    }
}
