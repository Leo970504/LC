package sort;

import java.util.Arrays;

public class 冒泡排序 {

    public static void popSort(int[] array) {
        if (array == null && array.length == 0) {
            return;
        }
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
