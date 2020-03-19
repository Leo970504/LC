package LeetCode;

public class Solution415字符串相加 {

    public String addStrings(String num1, String num2) {
        StringBuffer res = new StringBuffer();
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0;
        while(p1 >= 0 || p2 >= 0) {
            int i = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int j = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            res.append((i + j + carry) % 10);
            carry = (i + j + carry) / 10;
            p1--;
            p2--;
        }
        if(carry == 1) {
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
