package other;

public class 不用加减乘除做加法 {
    public int Add(int num1,int num2) {
        int result = 0;
        int ans = 0;
        do{
            result = num1 ^ num2;
            ans = (num1 & num2) << 1;
            num1 = result;
            num2 = ans;
        }while(ans != 0);
        return result;
    }
}
