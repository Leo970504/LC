package other;

public class 反转单词序列 {

    public static void main(String[] args) {
        System.out.println(ReverseSentence("student. a am I"));
    }

    public static String ReverseSentence(String str) {
        String result = new String();
        int p = str.length() - 1;
        int q = p;
        while(p >= 0) {
            while(p >= 0 && str.charAt(p) != ' ') {
                p--;
            }
            result = result + str.substring(p + 1, q + 1) + " ";
            p--;
            q = p;
        }
        return result;
    }
}
