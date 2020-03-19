package other;

/*
题目描述
请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。


思路：首先要想到所有的情况，然后进行分类讨论。-123.45e-67

+-号后面必定为数字或后面为.（-.123 = -0.123）
+-号只出现在第一位或在eE的后一位
.后面必定为数字或为最后一位（233. = 233.0）
eE后面必定为数字或+-号
 */

public class 数值字符串 {

    public static void main(String[] args) {
        String str = "123.45e+6";
        System.out.println(isNumeric(str.toCharArray()));
    }

    public static boolean isNumeric(char[] str) {
        boolean exp = false;
        boolean point = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '-' || str[i] == '+') {
                if (i == str.length - 1 || !(str[i + 1] >= '0' && str[i + 1] <= '9' || str[i + 1] == '.')) {
                    return false;
                }
                if (!(i == 0 || str[i - 1] == 'e' || str[i - 1] == 'E')) {
                    return false;
                }
            } else if (str[i] == '.') {
                if (point || exp) return false;
                if (i + 1 < str.length) {
                    if (str[i] < '0' && str[i] > '9') {
                        return false;
                    }
                }
                point = true;
            } else if (str[i] == 'e' || str[i] == 'E') {
                if (exp || i == str.length - 1 || !(str[i + 1] >= '0' && str[i + 1] <= '9' || str[i + 1] == '-' || str[i + 1] == '+')) {
                    return false;
                }
                exp = true;
            } else if (str[i] >= '0' && str[i] <= '9') {

            } else {
                return false;
            }
        }
        return true;
    }
}
