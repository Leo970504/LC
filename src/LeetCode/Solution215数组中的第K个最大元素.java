package LeetCode;

import java.util.PriorityQueue;

public class Solution215数组中的第K个最大元素 {
    public int findKthLargest(int[] nums, int k) {
        //大顶堆，小顶堆是(o1, o2)
        PriorityQueue<Integer> queue = new PriorityQueue<>((o2, o1) -> o1 - o2);
        for(int n : nums) {
            queue.add(n);
            if(queue.size() > k) {
                queue.poll();
            }
        }
        return queue.poll();
    }

    /* 快速排序后解法
    public int findKthLargest(int[] nums, int k) {
        qSort(nums, 0, nums.length - 1);
        int last = Integer.MAX_VALUE;
        for(int i = nums.length - 1; i >= 0; i--) {
            if(last == nums[i]) {
                continue;
            }
            k--;
            if(k == 0) return nums[i];
        }
        return -1;
    }

    void qSort(int nums[], int low, int high) {
        if(low > high) return;
        int p = low;
        int q = high;
        int key = nums[p];
        while(p < q) {
            while(p < q && nums[q] >= key) {
                q--;
            }
            int temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;
            while(p < q && nums[p] <=key) {
                p++;
            }
            temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;
        }
        qSort(nums, low, p - 1);
        qSort(nums, p + 1, high);
    }
     */
}
