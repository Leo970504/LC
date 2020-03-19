package sort;

import java.util.ArrayList;

/*
题目描述
输入n个整数，找出其中最小的K个数。
例如输入4,5,1,6,2,7,3,8这8个数字，
则最小的4个数字是1,2,3,4,。
 */

public class 最小的K个数 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input == null || input.length == 0 || k==0 || k > input.length) {
            return list;
        }
        quickSort(input, 0, input.length-1);
        for(int i=0; i<k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public void quickSort(int[] input, int low, int high) {
        if(low >= high) {
            return;
        }
        int i = low;
        int j = high;
        int key = input[i];
        while(i < j) {
            while(input[j] >= key && i < j) {
                j--;
            }
            int temp = input[j];
            input[j] = input[i];
            input[i] = temp;
            while(input[i] <= key && i < j) {
                i++;
            }
            temp = input[j];
            input[j] = input[i];
            input[i] = temp;
        }
        quickSort(input, low, i-1);
        quickSort(input, i+1, high);
    }
}
