package sort;

import java.util.Arrays;

public class 快速排序 {

    public static void quickSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int i = low;
        int j = high;
        int key = arr[i];
        while(i < j) {
            while(arr[j] >= key && j > i) {
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            while(arr[i] <= key && j > i) {
                i++;
            }
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        quickSort(arr, low, i-1);
        quickSort(arr, i+1, high);
    }
}
