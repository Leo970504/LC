package other;

/*
题目描述
在一个长度为n的数组里的所有数字都在0到n-1的范围内。
数组中某些数字是重复的，但不知道有几个数字是重复的。
也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2
 */

public class 构建乘积数组 {
    public int[] multiply(int[] A) {
        if(A == null && A.length == 0) {
            return null;
        }
        int[] C = new int[A.length];
        C[0] = 1;
        for(int i=1; i<A.length; i++) {
            C[i] = C[i - 1] * A[i - 1];
        }
        int[] D = new int[A.length];
        D[A.length - 1] = 1;
        for(int j=A.length-2; j>=0; j--) {
            D[j] = D[j + 1] * A[j + 1];
        }
        int[] B = new int[A.length];
        for(int k=0; k<A.length; k++) {
            B[k] = C[k] * D[k];
        }
        return B;
    }
}
