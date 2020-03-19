package 递归;

/*
题目描述
输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */

public class 判断平衡二叉树 {
    public boolean IsBalanced_Solution(TreeNode root) {
        return depth(root) != -1;
    }

    public int depth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = depth(root.left);
        if(left == -1) return -1;
        int right = depth(root.right);
        if(right == -1) return -1;
        if(left - right > 1 || right - left > 1) {
            return -1;
        }
        int depth = left > right ? left + 1 : right + 1;
        return depth;
    }
}
