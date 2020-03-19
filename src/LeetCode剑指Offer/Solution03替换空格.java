package LeetCode剑指Offer;

public class Solution03替换空格 {
    public String replaceSpace(String s) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                res.append(s.charAt(i));
            } else {
                res.append("%20");
            }
        }
        return new String(res);
    }
}
