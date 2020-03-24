package LeetCode每日一题;

public class Solution面试题17按摩师 {

    public static void main(String[] args) {
        int[] n = {2, 1};
        System.out.println(massage(n));
    }

    public static int massage(int[] nums) {
        int len = nums.length;
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < len; i++) {
            nums[i] = Math.max(nums[i - 1], nums[i - 2] +nums[i]);
        }
        return dp[len - 1];
    }
}
