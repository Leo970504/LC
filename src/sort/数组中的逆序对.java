package sort;

/*
题目描述
在数组中的两个数字，如果前面一个数字大于后面的数字，
则这两个数字组成一个逆序对。输入一个数组,
求出这个数组中的逆序对的总数P。
并将P对1000000007取模的结果输出。 即输出P%1000000007
 */

public class 数组中的逆序对 {

    private static int count = 0;

    public int InversePairs(int [] array) {
        mergeSort(array, 0, array.length - 1);
        return count;
    }

    public static void mergeSort(int[] a, int lo, int hi) {
        if(lo >= hi)
            return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void merge(int[] a, int lo, int mid, int hi) {
        int[] nums = new int[hi - lo +1];
        int index = 0;
        int p = lo, q = hi;
        while(p >= mid && q <= hi) {
            if(a[p] > a[q]) {
                count = (count + mid - p + 1) % 1000000007;
                nums[index++] = a[q++];
            }else {
                nums[index++] = a[p++];
            }
        }
        while(p <= mid) nums[index++] = a[p++];
        while(q <= hi) nums[index++] = a[q++];
        System.arraycopy(nums, 0, a, lo, hi - lo + 1);
    }
}
