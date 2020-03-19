package other;

import java.util.ArrayList;

public class 连续子数组最大和 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        for(int i=1; i<array.length; i++) {
            if(array[i - 1] > 0) {
                array[i] = array[i] + array[i-1];
            }
            max = Math.max(array[i], max);
        }
        return max;
    }
}
