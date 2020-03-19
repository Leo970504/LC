package LeetCode剑指Offer;

public class Solution09旋转数组的最小数字 {
    public int minArray(int[] numbers) {
        if(numbers.length == 1) {
            return numbers[0];
        }
        int min = numbers[0];
        for(int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i + 1] < numbers[i]) {
                return numbers[i + 1];
            }
        }
        return min;
    }
}
