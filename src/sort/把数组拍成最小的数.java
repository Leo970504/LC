package sort;

/*
题目描述
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
则打印出这三个数字能排成的最小数字为321323。
 */

public class 把数组拍成最小的数 {
    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new String();
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                String str1 = numbers[i] + "" + numbers[j];
                String str2 = numbers[j] + "" + numbers[i];
                if (Integer.valueOf(str1) > Integer.valueOf(str2)) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        String str = new String("");
        for (int i = 0; i < numbers.length; i++) {
            str = str + numbers[i];
        }
        return str;
    }
}
