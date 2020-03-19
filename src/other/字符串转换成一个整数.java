package other;

public class 字符串转换成一个整数 {

    public static void main(String[] args) {

        System.out.println(StrToInt("-2147483648"));
    }

    public static int StrToInt(String str) {
        if (str == null || "".equals(str)) {
            return 0;
        }
        boolean isPos = true;
        long res = 0;
        if (str.charAt(0) == '-') {
            isPos = false;
            str = str.substring(1);
        } else if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                long temp = str.charAt(i) - 48;
                temp = (long) (Math.pow(10, str.length() - i - 1) * temp);
                res = res + temp;
            } else {
                return 0;
            }
        }
        if ((isPos == true && res > Integer.MAX_VALUE) || (isPos == false && (0 - res) < Integer.MIN_VALUE)) {
            return 0;
        }
        return isPos == true ? (int) res : (int) res * -1;
    }
}
