package sort;

import java.util.Arrays;

public class 归并排序 {

    public static void main(String[] args) {
        int[] a = {15, 14, 1, 67, 5554, 64, 527, 2, 542, 7, 25, 742, 24, 2, 5, 46, 72, 7,};
        System.out.println(Arrays.toString(a));
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void merge(int[] a, int lo, int mid, int hi) {
        int[] nums = new int[hi - lo + 1];
        int p = lo, q = mid + 1;
        int index = 0;
        while (p <= mid && q <= hi) {
            if (a[p] > a[q]) {
                nums[index++] = a[q++];
            } else {
                nums[index++] = a[p++];
            }
        }
        while (p <= mid) {
            nums[index++] = a[p++];
        }
        while (q <= hi) {
            nums[index++] = a[q++];
        }
        System.arraycopy(nums, 0, a, lo, hi - lo + 1);
    }

}
