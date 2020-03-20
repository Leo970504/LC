package LeetCode每日一题;

public class Solution面试题最小的k个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int p = low;
        int q = high;
        int key = arr[low];
        while (p < q) {
            while (p < q && arr[q] >= key) {
                q--;
            }
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            while (p < q && arr[p] <= key) {
                p++;
            }
            temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
        }
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }
}
