package LeetCode;

public class Solution008字符串转换整数 {

    public int myAtoi(String str) {
        if(str == null || str == "") {
            return 0;
        }
        char[] chars = str.toCharArray();
        int index = 0;
        while(index < chars.length && str.charAt(index) == ' ') {
            index++;
        }
        if(index == chars.length) return 0;
        boolean flag = true;
        if(chars[index] == '+') {
            index++;
        } else if(chars[index] == '-') {
            index++;
            flag = false;
        } else if(!Character.isDigit(chars[index])) {
            return 0;
        }
        int res = 0;
        while(index < chars.length && Character.isDigit(chars[index])) {
            int num = chars[index] - '0';
            if(res > (Integer.MAX_VALUE - num) / 10) {
                return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + num;
            index++;
        }
        return  flag ? res : res * -1;
    }
}
