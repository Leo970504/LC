package 递归;
/*
题目描述
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

这题主要考察的是后序遍历的特点和二叉搜索树的特点。根据定义，后序遍历结果的最后一个元素就是当前二叉树的根元素。
结合二叉搜索树 左子节点 > 根节点 > 右子节点 的特点，我们可以找到左右子树的元素。
 */
public class 判断二叉树后序遍历 {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0)
            return false;
        return split(sequence, 0, sequence.length - 1);
    }
    public boolean split(int[] sequence, int start, int end) {
        if(start >= end)
            return true;
        int i = start;
        for(i=start; i<end; i++) {
            if(sequence[i] > sequence[end])
                break;
        }
        for(int j=i+1; j<end; j++) {
            if(sequence[j] < sequence[end]) {
                return false;
            }
        }
        return split(sequence, start, i-1) && split(sequence, i, end-1);
    }
}
