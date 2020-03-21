package LeetCode每日一题;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Solution945使数组唯一的最小增量 {

    public static int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        for(int i = 0; i < A.length; i++) {
            while(set.contains(A[i])) {
                if(i > 0 && A[i] <= A[i-1]) {
                    int temp = A[i];
                    A[i] = A[i - 1] + 1;
                    res = res + A[i] - temp;
                }
            }
            set.add(A[i]);
        }
        return res;
    }
}
