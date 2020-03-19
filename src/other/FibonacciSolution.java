package other;
//1、1、2、3、5、8、13、21、34
public class FibonacciSolution {

    public int Fibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int res = 0;
        int one = 0;
        int two = 1;
        for(int i=1; i<n; i++) {
            res = one + two;
            one = two;
            two = res;
        }
        return res;
    }
}
