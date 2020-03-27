package LeetCode剑指Offer;

import java.util.Arrays;

public class Solution20调整数组位置使奇数位于偶数前面 {

    public static int[] exchange(int[] nums) {
        int even = 0;
        int odd = nums.length - 1;
        while(even < odd) {
            while(even < odd && nums[odd] % 2 != 1) {
                odd--;
            }
            while(even < odd && nums[even] % 2 != 0) {
                even++;
            }
            int temp = nums[odd];
            nums[odd] = nums[even];
            nums[even] = temp;
        }
        return nums;
    }
}
