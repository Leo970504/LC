package LeetCode;

public class Solution470随机数Rand7实现Rand10 {
    public int rand10() {
        int temp;
        do {
            int a = rand7();
            int b = rand7();
            temp = (a - 1) * 7 + b;
        }while(temp > 40);
        return temp % 10 + 1;
    }

    //Rand7()可以得到一到七的随机数
    public static int rand7() {
        return -1;
    }
}
