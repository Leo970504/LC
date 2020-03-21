package LeetCode;

public class Solution004寻找两个有序数组的中位数 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] arr = new double[nums1.length + nums2.length];
        int p = 0;
        int p1 = 0;
        int p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                arr[p++] = nums1[p1++];
            } else {
                arr[p++] = nums2[p2++];
            }
        }
        while (p1 < nums1.length) {
            arr[p++] = nums1[p1++];
        }
        while (p2 < nums2.length) {
            arr[p++] = nums2[p2++];
        }
        if (arr.length % 2 == 1) {
            return arr[arr.length / 2];
        }
        return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
    }
}
