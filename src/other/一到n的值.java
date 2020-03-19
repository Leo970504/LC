package other;

/*
题目描述
求1+2+3+...+n，要求不能使用乘除法、
for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。

作为"&&"和"||"操作符的操作数表达式，这些表达式在进行求值时，只要最终的结果已经可以确定是真或假，求值过程便告终止，这称之为短路求值（short-circuit evaluation）。
假如expr1和expr2都是表达式，并且expr1的值为0，在下面这个逻辑表达式的求值过程中：
expr1 && expr2
expr2将不会进行求值，因为整个逻辑表达式的值已经可以确定为0。
expr1 || expr2
expr2将不会进行求值，因为整个逻辑表达式的值已经确定为1。
来自百度百科的解释，表示跨行小白可以看懂。
思路：因此可以利用左边的表达式来作为递归结束的判断条件。因此递归的表达式就在右边了。而想到递归的解法，必然是sum=Sum(n)=Sum(n-1)+n
使用&&,表示两边都为真，才为真，左边为假，右边就没用了。因此在不断递归时，直到左边为假时，才不执行右边。因此在第一次进行右边的判断时，就进入递归的调用。
 */
public class 一到n的值 {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (sum>0) && (sum += Sum_Solution(n - 1))>0;
        return sum;
    }
}
