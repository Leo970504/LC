package other;
/*
题目描述
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
超过数组长度的一半，因此输出2。如果不存在则输出0。
 */

public class 数组中超过一半的数字 {

    public int MoreThanHalfNum_Solution(int [] array) {
        int temp = 0;
        int times = 0;
        for(int i=0; i<array.length; i++) {
            if(times == 0) {
                temp = array[i];
                times = 1;
                continue;
            }
            if(array[i] == temp) {
                times++;
            }
            if(array[i] != temp) {
                times--;
                if(times == 0) {
                    temp = array[i];
                    times = 1;
                }
            }
        }
        times = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] == temp) {
                times++;
            }
        }
        return times > array.length/2 ? temp : 0;
    }
}
