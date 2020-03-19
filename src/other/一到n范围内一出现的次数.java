package other;

public class 一到n范围内一出现的次数 {

    public static int NumberOf1Between1AndN_Solution(int n) {
        int num = 0;
        for(int i=n; i>=1; i--) {
            int j = i;
            while(j != 0) {
                int temp = j % 10;
                if(temp == 1) num++;
                j = j/10;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(5));
    }
}
