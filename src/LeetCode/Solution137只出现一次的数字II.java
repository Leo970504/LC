package LeetCode;

public class Solution137只出现一次的数字II {

    public int singleNumber(int[] nums) {
        qSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length - 2; i += 3) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    private void qSort(int nums[], int low, int high) {
        if (low >= high) return;
        int p = low;
        int q = high;
        int key = nums[p];
        while (p < q) {
            while (p < q && nums[q] >= key) {
                q--;
            }
            int temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;
            while (p < q && nums[p] <= key) {
                p++;
            }
            temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;
        }
        qSort(nums, low, p - 1);
        qSort(nums, p + 1, high);
    }
}
