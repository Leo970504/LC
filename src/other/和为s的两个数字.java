package other;

/*
题目描述
输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
输出描述:
对应每个测试案例，输出两个数，小的先输出。
 */

import java.util.ArrayList;

public class 和为s的两个数字 {

    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if(array == null || array.length <= 1) {
            return res;
        }
        int left = 0;
        int right = array.length - 1;
        while(left < right) {
            if(sum == array[left] + array[right]){
                res.add(array[left]);
                res.add(array[right]);
                break;
            }else if(sum > array[left] + array[right]) {
                left++;
            }else {
                right--;
            }
        }
        return res;
    }
}
