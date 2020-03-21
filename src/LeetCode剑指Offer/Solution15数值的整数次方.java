package LeetCode剑指Offer;

public class Solution15数值的整数次方 {
    public double myPow(double x, int n) {
        long N = n;
        double res = 1.0;
        if(N < 0) {
            N = N * -1;
            x = 1 / x;
        }
        while(N != 0) {
            if(N % 2 == 1) {
                res = res * x;
            }
            x = x * x;
            N = N / 2;
        }
        return res;
    }
}
