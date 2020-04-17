package LeetCode每日一题;

public class Solution55跳跃游戏 {

    public boolean canJump(int[] nums) {
        int len = nums.length;
        int right = 0;
        for(int i = 0; i < len; i++) {
            if(i <= right) {
                right = Math.max(right, i + nums[i]);
                if(right >= len - 1) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
}
