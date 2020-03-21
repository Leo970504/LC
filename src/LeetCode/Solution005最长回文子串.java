package LeetCode;

public class Solution005最长回文子串 {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return new String();
        }
        boolean ss = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                ss = false;
            }
        }
        if (ss == true) return s;
        int res = 0;
        int p = 0;
        int q = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                boolean flag = true;
                int n = i;
                int m = j;
                while (n <= m) {
                    if (s.charAt(n) == s.charAt(m)) {
                        n++;
                        m--;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    int len = j - i + 1;
                    if (len > res) {
                        res = len;
                        p = i;
                        q = j;
                    }
                }
            }
        }
        return s.substring(p, q + 1);
    }
}
