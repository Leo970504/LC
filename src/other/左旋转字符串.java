package other;

public class 左旋转字符串 {

    public String LeftRotateString(String str,int n) {
        if(str == null || str.length() <= 1) return str;
        n = n % str.length();
        for(int i=0; i<n; i++) {
            str = str + str.charAt(0);
            str = str.substring(1, str.length());
        }
        return str;
    }
}
