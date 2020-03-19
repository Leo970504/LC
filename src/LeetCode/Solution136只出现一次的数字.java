package LeetCode;

public class Solution136只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        if(nums.length > 1) {
            for(int i=1; i<nums.length; i++) {
                res = res ^ nums[i];
            }
        }
        return res;
    }
}
