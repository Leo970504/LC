package search;

import java.util.Arrays;

public class 数字在排序数组中出现的次数 {

    public static int GetNumberOfK(int [] array , int k) {
        int index = Arrays.binarySearch(array, k);
        if(index < 0 || index >= array.length) {
            return 0;
        }
        int count = 1;
        int left = index - 1;
        int right = index + 1;
        while(left >= 0 && array[left] == k) {
            count++;
            left--;
        }
        while(right < array.length && array[right] == k) {
            count++;
            right++;
        }
        return count;
    }
}
